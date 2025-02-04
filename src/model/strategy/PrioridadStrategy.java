package model.strategy;

import model.Emergencia;

public interface PrioridadStrategy {

    int calcularPrioridad(Emergencia emergencia);

}
