public abstract class RespuestaEmergencia {
    String ubicacion;
    int nivelGravedad;
    int tiempoRespuesta;

    public RespuestaEmergencia(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public abstract void atenderEmergencia();

}
