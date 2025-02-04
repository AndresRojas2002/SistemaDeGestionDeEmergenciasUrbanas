package model.factory;

import model.AccidenteVehicular;
import model.Emergencia;
import model.Incendio;
import model.Robo;
import utils.TipoEmergencia;
import utils.TipoNivelGravedad;
import utils.TipoUbicacion;




public class EmergenciaFactory {

    public static Emergencia getEmergencia(TipoEmergencia tipo, TipoUbicacion ubicacion, TipoNivelGravedad nivelGravedad, int tiempoRespuesta) {
        switch (tipo) {
            case INCENDIO:
                return new Incendio (ubicacion, nivelGravedad, tiempoRespuesta);

            case ACCIDENTE_VEHICULAR:
                return new AccidenteVehicular(ubicacion, nivelGravedad, tiempoRespuesta);

                case ROBO: 
                return new Robo(ubicacion, nivelGravedad, tiempoRespuesta);

            default:
                throw new IllegalArgumentException("tipo de emergencia no valida");
        } 

    }

}
