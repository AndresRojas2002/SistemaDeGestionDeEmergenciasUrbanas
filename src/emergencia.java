public class emergencia {

    String tipo;
    String ubicacion;
    int nivelGravedad;
    int tiempoRespuesta;

    


    public emergencia() {
    }




    public emergencia(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }




    public String getTipo() {
        return tipo;
    }




    public String getUbicacion() {
        return ubicacion;
    }




    public int getNivelGravedad() {
        return nivelGravedad;
    }




    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

       

    



}
