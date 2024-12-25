public class robo extends emergencia {
    private String descripcion;


     public robo(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta, String descripcion) {
        super("robo", ubicacion, nivelGravedad, tiempoRespuesta);
        this.descripcion = descripcion;
    }

   
        public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void atenderRobo() {
        System.out.println("Policía atendiendo el robo: " + descripcion);
    }

}
