public class EmergenciaFactory {

    public static Emergencia getEmergencia(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        switch (tipo) {
            case "Incendio":
                return new Incendio (tipo, ubicacion, nivelGravedad, tiempoRespuesta);

            case "Accidente Vehicular":
                return new AccidenteVehicular(tipo, ubicacion, nivelGravedad, tiempoRespuesta);

                case "Robo": 
                return new Robo(tipo, ubicacion, nivelGravedad, tiempoRespuesta);

            default:
                throw new IllegalArgumentException("tipo de emergencia no valida");
        } 

    }

}
