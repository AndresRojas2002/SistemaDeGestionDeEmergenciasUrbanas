package view;

import java.util.Scanner;

public class Menu {

    public void mostraMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir && sc.hasNextInt()) {

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
                    RegistrarEmergencia registrarEmergencia = new RegistrarEmergencia();
                    registrarEmergencia.registrar();
                    break;

                case 2:

                case 3:
                    System.out.println();
                    // TODO atender emergencia
                    break;

                case 4:
                    // TODO mostrar estadisticas
                    break;

                case 5: // TODO mostrar estadisticas
                    break;

                case 6:
                    System.out.println("\u001B[36mPrograma terminado...\u001B[0m");
                    salir = true;
                    break;

                default:
                    System.out.println("\u001B[31mOpcion no validad, por favor intente de nuevo\u001B[0m");

            }

        }
        sc.close();

    }

}

