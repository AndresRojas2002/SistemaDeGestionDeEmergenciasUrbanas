package model;
import utils.TipoEmergencia;
import utils.TipoNivelGravedad;
import utils.TipoUbicacion;

public class Robo extends Emergencia {

    public Robo( TipoUbicacion ubicacion, TipoNivelGravedad nivelGravedad, int tiempoRespuesta) {
        super(TipoEmergencia.ROBO, ubicacion, nivelGravedad, tiempoRespuesta);
    
    }

   

   



}
