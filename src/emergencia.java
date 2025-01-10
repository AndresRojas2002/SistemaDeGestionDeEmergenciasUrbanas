public abstract class Emergencia extends RespuestaEmergencia {

    TipoEmergencia tipo;

    public Emergencia(TipoEmergencia tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(ubicacion, nivelGravedad, tiempoRespuesta);
        this.tipo = tipo;

    }

   

    public void evaluarEstado() {
        System.out.println("evaluando estado de la emergencia en la ubicacion" + ubicacion);
    }

}
