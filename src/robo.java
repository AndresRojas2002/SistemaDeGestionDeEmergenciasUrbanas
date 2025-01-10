public class Robo extends Emergencia {

    public Robo(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(TipoEmergencia.ROBO, ubicacion, nivelGravedad, tiempoRespuesta);

    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Atendiendo Robo");

    }

}
