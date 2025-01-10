public class Ambulacia extends RespuestaEmergencia {

    public Ambulacia(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Ambulancia atendiendo emergencia en la ubicacion " + ubicacion);
    }

}
