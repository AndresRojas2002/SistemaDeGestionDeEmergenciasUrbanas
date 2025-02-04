package model;
import utils.TipoEmergencia;
import utils.TipoNivelGravedad;
import utils.TipoUbicacion;

public class AccidenteVehicular extends Emergencia {

    public AccidenteVehicular( TipoUbicacion ubicacion, TipoNivelGravedad nivelGravedad, int tiempoRespuesta) {
        super(TipoEmergencia.ACCIDENTE_VEHICULAR, ubicacion, nivelGravedad, tiempoRespuesta);
        
    }


}
