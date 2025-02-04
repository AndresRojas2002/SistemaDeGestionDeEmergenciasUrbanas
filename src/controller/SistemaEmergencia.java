package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.AccidenteVehicular;
import model.Emergencia;
import model.Incendio;
import model.Robo;
import model.interfaces.IRespuestaEmergencia;
import model.observer.EmergenciaObserver;
import model.observer.SujetoEmergencias;
import model.services.Ambulancia;
import model.services.Bomberos;
import model.services.Policia;
import model.strategy.PrioridadGravedadStrategy;
import model.strategy.PrioridadStrategy;
import utils.TipoNivelGravedad;


public class SistemaEmergencia implements SujetoEmergencias {

    private static SistemaEmergencia instancia;
    private List<Emergencia> listaEmergencias;
    private List<IRespuestaEmergencia> listaRecursos;
    private List<EmergenciaObserver> observadores;
    private PrioridadStrategy prioridadStrategy;
    private int emergenciasAtendidas;
    private long tiempoTotalAtencion;
    

    public SistemaEmergencia() {
        prioridadStrategy = new PrioridadGravedadStrategy();
        listaEmergencias = new ArrayList<>();        
        listaRecursos = new ArrayList<>();
        observadores = new ArrayList<>();
        emergenciasAtendidas = 0;
        tiempoTotalAtencion = 0;

    }

    public static SistemaEmergencia getInstancia() {
        if (instancia == null) {
            instancia = new SistemaEmergencia();
        }
        return instancia;
    }



    @Override
    public void agregarObserver(EmergenciaObserver observerEmergencias) {
       observadores.add(observerEmergencias);
    }

    @Override
    public void eliminarObserver(EmergenciaObserver observerEmergencias) {
        observadores.remove(observerEmergencias); 
    }

    @Override
    public void notificarEmergencias(Emergencia emergencia) {
        for (EmergenciaObserver observer : observadores) {
            observer.onNuevaEmergencia(emergencia);
        } 
    }

    public void registrarRecurso(IRespuestaEmergencia recurso) {
        listaRecursos.add(recurso);
    }
    public void mostrarEstadoRecursos() {
        System.out.println("\n--- ESTADO ACTUAL DE RECURSOS ---");
        for (IRespuestaEmergencia r : listaRecursos) {
            System.out.println(r.toString());
        }
    }

    public List<IRespuestaEmergencia> filtrarRecursosDisponibles() {
        return listaRecursos.stream()
                .filter(r -> r.estaDisponible())
                .collect(Collectors.toList());
    }

    public void registrarNuevaEmergencia(Emergencia e) {
        listaEmergencias.add(e);
        notificarEmergencias(e);
    }

    public List<Emergencia> getEmergenciasPendientes() {
        return listaEmergencias.stream()
                .filter(e -> !e.isAtendida())
                .collect(Collectors.toList());
    }

    public void asignarRecursosAEmergencia(Emergencia emergencia) {
        List<IRespuestaEmergencia> disponibles = filtrarRecursosDisponibles();
        
        if (disponibles.isEmpty()) {
            System.out.println("No hay recursos disponibles para esta emergencia.");
            return;
        }
        
        System.out.println("-> Asignando recursos según el nivel de gravedad: " + emergencia.getNivelGravedad());
    
        // Prioridad según gravedad
        int cantidadPolicias = 0, cantidadBomberos = 0, cantidadAmbulancias = 0;
        TipoNivelGravedad gravedad = emergencia.getNivelGravedad();
    
        switch (gravedad) {
            case GRAVE:
                cantidadPolicias = 3;
                cantidadBomberos = 3;
                cantidadAmbulancias = 2;
                break;
            case CRITICA:
                cantidadPolicias = 2;
                cantidadBomberos = 2;
                cantidadAmbulancias = 1;
                break;
            case MODERADA:
                cantidadPolicias = 1;
                cantidadBomberos = 1;
                cantidadAmbulancias = 1;
                break;
           
        }
    
        // Asignar recursos según tipo
        asignarRecursosSegunTipo(disponibles, Policia.class, cantidadPolicias, emergencia);
        asignarRecursosSegunTipo(disponibles, Bomberos.class, cantidadBomberos, emergencia);
        asignarRecursosSegunTipo(disponibles, Ambulancia.class, cantidadAmbulancias, emergencia);
    }
    
    private void asignarRecursosSegunTipo(List<IRespuestaEmergencia> disponibles, Class<?> tipoRecurso, int cantidad, Emergencia emergencia) {
        for (IRespuestaEmergencia recurso : disponibles) {
            if (tipoRecurso.isInstance(recurso)) {
                recurso.atenderEmergencia(emergencia);
                cantidad--;
                if (cantidad == 0) break;
            }
        }
    }
    

    public void atenderEmergencia(Emergencia e) {
        if (e.isAtendida()) {
            System.out.println("Esta emergencia ya fue atendida.");
            return;
        }

        e.iniciarAtencion();

        // Muchachos esto es para simular el tiempo que tarda en atenderse una
        // emergencia
        // puede colocar cualquier cantidad de milisegundos 1000 milisegundos es 1
        // segundo
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        e.finalizarAtencion();
        System.out.println("Emergencia atendida: " + e.getDescripcion());

        emergenciasAtendidas++;
        tiempoTotalAtencion += e.getTiempoRespuesta();
    }

    public void mostrarEstadisticas() {
        System.out.println("\n=== ESTADÍSTICAS DEL DÍA ===");
        System.out.println("Emergencias atendidas: " + emergenciasAtendidas);

        long promedioMs = 0;
        if (emergenciasAtendidas > 0) {
            promedioMs = tiempoTotalAtencion / emergenciasAtendidas;
        }
        double promedioSeg = promedioMs / 1000.0;
        System.out.println("Tiempo promedio de respuesta: " + promedioSeg + " seg.");

        long noAtendidas = listaEmergencias.stream()
                .filter(e -> !e.isAtendida())
                .count();
        System.out.println("Emergencias no atendidas: " + noAtendidas);
    }

    public void finalizarJornada() {
        mostrarEstadisticas();
        System.out.println("Guardando registro del día (simulado)...");
        // Lógica para guardarlo en BD o archivo
        System.out.println("Sistema preparado para siguiente ciclo.");
    }

    public void setEstrategiaPrioridad(PrioridadStrategy nuevaEstrategia) {
        prioridadStrategy = nuevaEstrategia;
    }


}
