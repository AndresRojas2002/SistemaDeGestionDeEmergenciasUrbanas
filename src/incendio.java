public class Incendio extends Emergencia {
    

    public Incendio(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(TipoEmergencia.INCENDIO, ubicacion, nivelGravedad, tiempoRespuesta);
        
    }

    

    @Override
    public void atenderEmergencia() {
        // TODO Auto-generated method stub
    }

}
