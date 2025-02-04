package view;

import model.services.Policia;
import model.services.Bomberos;
import model.services.Ambulancia;
import model.interfaces.IRespuestaEmergencia;
import model.AccidenteVehicular;
import model.Emergencia;
import model.Incendio;
import model.Robo;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import utils.TipoRecursos;

public class Recursos {

    private List<IRespuestaEmergencia> recursosDisponibles;

    public Recursos() {
        recursosDisponibles = new ArrayList<>();
        
        // Aquí se crea una cantidad aleatoria de recursos específicos
        Random aleatorio = new Random();
        
        // Agregar recursos Policia
        for (int i = 0; i < aleatorio.nextInt(15); i++) {
            recursosDisponibles.add(new Policia("Policia-" + i, aleatorio.nextInt(10), aleatorio.nextInt(100)));
        }
        
        // Agregar recursos Bomberos
        for (int i = 0; i < aleatorio.nextInt(19); i++) {
            recursosDisponibles.add(new Bomberos("Bombero-" + i, aleatorio.nextInt(12), aleatorio.nextInt(80)));
        }
        
        // Agregar recursos Ambulancia
        for (int i = 0; i < aleatorio.nextInt(12); i++) {
            recursosDisponibles.add(new Ambulancia("Ambulancia-" + i, aleatorio.nextInt(8), aleatorio.nextInt(120)));
        }
    }

    // Filtrar los recursos que estén disponibles
    public List<IRespuestaEmergencia> filtrarRecursosDisponibles() {
        return recursosDisponibles.stream()
                .filter(IRespuestaEmergencia::estaDisponible)
                .collect(Collectors.toList());
    }

    // Método para asignar recursos según tipo y emergencia
    public void asignarRecursosSegunTipo(List<IRespuestaEmergencia> disponibles, TipoRecursos tipo, Emergencia emergencia) {
        // Asignamos los recursos según el tipo de emergencia
        for (IRespuestaEmergencia recurso : disponibles) {
            if (tipo == TipoRecursos.POLICIAS && recurso instanceof Policia) {
                recurso.atenderEmergencia(emergencia);
                break;
            } else if (tipo == TipoRecursos.BOMBEROS && recurso instanceof Bomberos) {
                recurso.atenderEmergencia(emergencia);
                break;
            } else if (tipo == TipoRecursos.AMBULANCIAS && recurso instanceof Ambulancia) {
                recurso.atenderEmergencia(emergencia);
                break;
            }
        }
    }

    // Asignar los recursos disponibles a una emergencia
    public void asignarRecursosAEmergencia(Emergencia emergencia) {
        List<IRespuestaEmergencia> disponibles = filtrarRecursosDisponibles();

        if (disponibles.isEmpty()) {
            System.out.println("No hay recursos disponibles para esta emergencia.");
            return;
        }

        // Asignar los recursos según el tipo de emergencia
        System.out.println("-> Asignando recursos automáticamente...");

        if (emergencia instanceof Incendio) {
            asignarRecursosSegunTipo(disponibles, TipoRecursos.BOMBEROS, emergencia);
        } else if (emergencia instanceof AccidenteVehicular) {
            asignarRecursosSegunTipo(disponibles, TipoRecursos.AMBULANCIAS, emergencia);
        } else if (emergencia instanceof Robo) {
            asignarRecursosSegunTipo(disponibles, TipoRecursos.POLICIAS, emergencia);
        }
    }
}
