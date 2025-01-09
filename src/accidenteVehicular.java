public class accidenteVehicular extends emergencia {
    private int numeroDeVehiculos;

    public accidenteVehicular(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta,
            int numeroDeVehiculos) {
        super("Accidente Vehicular", ubicacion, nivelGravedad, tiempoRespuesta);
        this.numeroDeVehiculos = numeroDeVehiculos;
    }

    public int getNumeroDeVehiculos() {
        return numeroDeVehiculos;
    }

    public void setNumeroDeVehiculos(int numeroDeVehiculos) {
        this.numeroDeVehiculos = numeroDeVehiculos;
    }

    @Override
    public void atenderEmergencia() {
        // TODO Auto-generated method stub

    }

}
