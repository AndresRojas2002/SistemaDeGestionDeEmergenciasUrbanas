public class robo extends emergencia {
    private String descripcion;

    public robo(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta, String descripcion) {
        super("Robo", ubicacion, nivelGravedad, tiempoRespuesta);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void atenderEmergencia() {
        // TODO Auto-generated method stub

    }

}
