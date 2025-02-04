package model.services;
import model.Emergencia;
import model.interfaces.IRespuestaEmergencia;

public abstract class ServicioBase implements IRespuestaEmergencia {

    private String id;
    private int personalDisponible;
    private int combustible;


    
    public ServicioBase(String id, int personalDisponible, int combustible) {
        this.id = id;
        this.personalDisponible = personalDisponible;
        this.combustible = combustible;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getPersonalDisponible() {
        return personalDisponible;
    }

    @Override
    public int getCombustible() {
        return combustible;

    }

    @Override
    public boolean estaDisponible() {
        return personalDisponible > 0 && combustible > 0;
    }

    @Override
    public void asignarPersonal(int cantidad) {
        if (cantidad <= personalDisponible) {
            personalDisponible -= cantidad;

        } else {
            System.out.println("No hay suficiente personal disponible.");
        }
    }

    @Override
    public void libreraPersonal(int cantidad) {
        personalDisponible += cantidad;
    }

    @Override
    public void gastarCombustible(int cantidad) {
        combustible = Math.max(0, combustible - cantidad);
    }

    @Override
    public void tanquearCombustible(int cantidad) {
        combustible += cantidad;
    }

    
    public  abstract void atenderEmergencia(Emergencia emergencia);

    @Override
    public String toString() {
        return "ServicioBase [id=" + id + ", personalDisponible=" + personalDisponible + ", combustible=" + combustible
                + "]";
    }

      

}
