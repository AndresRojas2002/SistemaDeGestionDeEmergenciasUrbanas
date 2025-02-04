package view;

import utils.TipoEmergencia;
import utils.TipoNivelGravedad;
import utils.TipoUbicacion;

public class DatosEmergencia  {

    RegistrarEmergencia registrarEmergencia = new RegistrarEmergencia();

    public DatosEmergencia(RegistrarEmergencia registrarEmergencia) {
        this.registrarEmergencia = registrarEmergencia;
    }

    public void mostrarDatosEmergencia() {
        TipoEmergencia tipo = registrarEmergencia.getTipoEmergencia();
        TipoUbicacion ubicacion = registrarEmergencia.getTipoUbicacion();
        TipoNivelGravedad nivelGravedad = registrarEmergencia.getTipoNivelGravedad();
        int tiempoRespuesta = registrarEmergencia.getTiempoRespuesta();

        System.out.println("\u001B[36m=====DATOS DE LA EMERGENCIA REGISTRADA=====\u001B[0m\n");
        System.out.println("\u001B[32mTipo de Emergencia: " + tipo + "\u001B[0m");
        System.out.println("\u001B[32mUbicacin: " + ubicacion + "\u001B[0m");
        System.out.println("\u001B[32mNivel de Gravedad: " + nivelGravedad + "\u001B[0m");
        System.out.println("\u001B[32mTiempo de Respuesta: " + tiempoRespuesta + " minutos\u001B[0m");
        System.out.println("-------------------------------------");
    }
}
