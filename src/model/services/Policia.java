package model.services;

import model.Emergencia;

public class Policia extends ServicioBase {

    public Policia(String id, int personalDisponible, int combustible) {
        super(id, personalDisponible, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("\u001B[33mPolicia en camino!!!\u001B[0m\n");
        System.out.println("->\u001B[32m [Policia" + getId() + " ]: \u001B[0m" + emergencia.toString()); 

        asignarPersonal(2);
        gastarCombustible(4);
    }

}
