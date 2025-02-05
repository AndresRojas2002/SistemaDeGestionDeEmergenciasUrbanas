package model.services;

import model.Emergencia;

public class Bomberos extends ServicioBase {

    public Bomberos(String id, int personalDisponible, int combustible) {
        super(id, personalDisponible, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("\u001B[33mBomberos en camino!!!\u001B[0m\n");
        System.out.println("->\u001B[32m [Bomberos" + getId() + " ]: \u001B[0m" + emergencia.toString());  

        asignarPersonal(5);
        gastarCombustible(11);

    }

}
