public class incendio extends emergencia {
    private int areaAfectada;

    public incendio(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta, int areaAfectada) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
        this.areaAfectada = areaAfectada;
    }

    public int getAreaAfectada() {
        return areaAfectada;
    }

    public void setAreaAfectada(int areaAfectada) {
        this.areaAfectada = areaAfectada;
    }

    


}
