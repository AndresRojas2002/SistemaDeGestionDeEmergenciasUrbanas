public class Policia extends RespuestaEmergencia {

    public Policia(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("policia atendiendo emergencia en la ubicacion  " + ubicacion);
    }

}
