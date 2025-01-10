public class AccidenteVehicular extends Emergencia {
    
    public AccidenteVehicular(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super("Accidente Vehicular", ubicacion, nivelGravedad, tiempoRespuesta);
        
    }
   

    @Override
    public void atenderEmergencia() {
        // TODO Auto-generated method stub

    }

}
