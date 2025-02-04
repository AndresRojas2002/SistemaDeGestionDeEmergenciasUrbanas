package model.observer;

import model.Emergencia;

public interface SujetoEmergencias {

    void agregarObserver(EmergenciaObserver observerEmergencias);
    void eliminarObserver(EmergenciaObserver observerEmergencias);
    void notificarEmergencias(Emergencia emergencia);

}
