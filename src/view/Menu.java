package view;

import java.util.Scanner;

import controller.SistemaEmergencia;
import model.services.Ambulancia;
import model.services.Bomberos;
import model.services.Policia;

public class Menu {

    public void mostraMenu() {

        SistemaEmergencia sistema = SistemaEmergencia.getInstancia();

        inicializarRecursosDemo(sistema);
       
        Scanner sc = new Scanner(System.in);
        RegistrarEmergencia registrarEmergencia = new RegistrarEmergencia();
        DatosEmergencia datosEmergencia = new DatosEmergencia(registrarEmergencia);
        AtenderEmergencia atenderEmergencia = new AtenderEmergencia();
         

        int opcion;

        do {

            System.out.println("\n\u001B[36m" + "=====BIENVENIDOS AL SERVICIO DE EMERGENCIAS=====" + "\u001B[0m\n");

            System.out.println("1. \u001B[32mRegistrar emergencia\u001B[0m ");
            System.out.println("2. \u001B[32mDatos de emergencia\u001B[0m");
            System.out.println("3. \u001B[32mRecursos disponibles\u001B[0m");
            System.out.println("4. \u001B[32mAtender emergencia\u001B[0m");
            System.out.println("5. \u001B[32mMostrar estadisticas\u001B[0m");
            System.out.println("6. \u001B[32mSalir\u001B[0m\n");

            System.out.print("\u001B[35m" + "selecciona una opcion: " + "\u001B[0m");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:

                    registrarEmergencia.registrar(sistema, sc);
                    break;

                case 2:

                    datosEmergencia.mostrarDatosEmergencia();
                    break;

                case 3:
                    sistema.mostrarEstadoRecursos();
                    break;

                case 4:
                atenderEmergencia.atenderEmergenciaMenu(sistema, sc);
                    break;

                case 5: 
                sistema.mostrarEstadisticas();
                    break;

                case 6:

                System.out.println("\u001B[36mPrograma terminado...\u001B[0m");
                    break;

                default:
                    System.out.println("\u001B[31mOpcion no validad, por favor intente de nuevo\u001B[0m");

            }
        } while (opcion != 6);
        sc.close();
    }

    private static void inicializarRecursosDemo(SistemaEmergencia sistema) {
        sistema.registrarRecurso(new Bomberos("Unidad-B1", 5, 100));
        sistema.registrarRecurso(new Bomberos("Unidad-B2", 3, 80));
        sistema.registrarRecurso(new Ambulancia("Unidad-A1", 2, 100));
        sistema.registrarRecurso(new Ambulancia("Unidad-A2", 2, 60));
        sistema.registrarRecurso(new Policia("Unidad-P1", 4, 100));
        sistema.registrarRecurso(new Policia("Unidad-P2", 2, 70));
    }
}
