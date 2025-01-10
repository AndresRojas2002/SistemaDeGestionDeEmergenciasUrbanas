public class Bomberos extends RespuestaEmergencia {

    public Bomberos(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("policia atendiendo emergencia en la ubicacion " + ubicacion);
    }

}
