package view;

import utils.TipoEmergencia;
import utils.TipoNivelGravedad;
import utils.TipoUbicacion;

public class DatosEmergencia extends RegistrarEmergencia {

public void mostrarDatosEmergencia() {
    registrar();

    TipoEmergencia tipo = getTipoEmergencia();
    TipoUbicacion ubicacion = getTipoUbicacion();
    TipoNivelGravedad nivelGravedad = getTipoNivelGravedad();
    int tiempoRespuesta = getTiempoRespuesta();

    System.out.println("\u001B[36m=====DATOS DE LA EMERGENCIA REGISTRADA=====\u001B[0m");
    System.out.println("\u001B[32mTipo de Emergencia: " + tipo + "\u001B[0m");
    System.out.println("\u001B[32mUbicaci n: " + ubicacion + "\u001B[0m");
    System.out.println("\u001B[32mNivel de Gravedad: " + nivelGravedad + "\u001B[0m");
    System.out.println("\u001B[32mTiempo de Respuesta: " + tiempoRespuesta + " minutos\u001B[0m");
    System.out.println("-------------------------------------");
}


}
