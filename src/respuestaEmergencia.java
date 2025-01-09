public abstract class respuestaEmergencia {
    String ubicacion;
    int nivelGravedad;
    int tiempoRespuesta;

    public respuestaEmergencia(String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }

   

}
