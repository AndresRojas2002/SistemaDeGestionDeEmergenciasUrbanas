package model.services;

import model.Emergencia;

public class Policia extends ServicioBase {

    public Policia(String id, int personalDisponible, int combustible) {
        super(id, personalDisponible, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Policia en camino!!!");
        System.out.println("-> [policia" + getId() + "]: " + emergencia.toString());

        asignarPersonal(2);
        gastarCombustible(4);
    }

}
