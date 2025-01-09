public abstract class emergencia extends respuestaEmergencia {

    String tipo;

    public emergencia(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(ubicacion, nivelGravedad, tiempoRespuesta);
        this.tipo = tipo;

    }

    public abstract void atenderEmergencia();

    public void evaluarEstado() {
        System.out.println("evaluando estado de la emergencia en la ubicacion" + ubicacion);
    }

}
