package model.services;

import model.Emergencia;

public class Ambulancia extends ServicioBase{

    public Ambulancia(String id, int personalDisponible, int combustible) {
        super(id, personalDisponible, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("\u001B[33m"+"Ambulancia en camino!!!"+"\u001B[0m\n");
        System.out.println("->\u001B[32m [Ambulancia" + getId() + " ]: \u001B[0m" + emergencia.toString());         
        asignarPersonal(3);
        gastarCombustible(5);
    }
}
