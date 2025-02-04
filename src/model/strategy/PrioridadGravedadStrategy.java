package model.strategy;

import model.Emergencia;

public class PrioridadGravedadStrategy implements PrioridadStrategy {

    @Override
    public int calcularPrioridad(Emergencia emergencia) {

        switch (emergencia.getNivelGravedad()) {
            case MODERADA:
                return 3;
            case GRAVE:
                return 2;
            case CRITICA:                
                return 1;            
            default:
                return 1;            
        }

    }
}