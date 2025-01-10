public class Incendio extends Emergencia {
    

    public Incendio(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super("Incendio", ubicacion, nivelGravedad, tiempoRespuesta);
        
    }

    

    @Override
    public void atenderEmergencia() {
        // TODO Auto-generated method stub
    }

}
