public class EmergenciaFactory {

    public static Emergencia getEmergencia(TipoEmergencia tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
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
