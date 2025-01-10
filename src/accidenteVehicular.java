public class AccidenteVehicular extends Emergencia {
    
    public AccidenteVehicular(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(TipoEmergencia.ACCIDENTE_VEHICULAR, ubicacion, nivelGravedad, tiempoRespuesta);
        
    }
   

    @Override
    public void atenderEmergencia() {
       System.out.println("Atendiendo Accidente Vehicular");

    }

}
