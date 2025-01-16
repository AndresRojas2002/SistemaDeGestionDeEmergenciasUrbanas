import java.util.Scanner;

public class Menu {

    public void mostraMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\nBIEMBENIDOS AL SERVICIO DE EMERGENCIAS ");
            System.out.println("-------------------------------------");
            System.out.println("1. Registrar emergencia ");
            System.out.println("2. Recursos disponibles");
            System.out.println("3. Atender emergencia");
            System.out.println("4. Mostrar estadisticas");
            System.out.println("5. Salir\n");
            System.out.print("selecciona una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    RegistrarEmergencia registrarEmergencia = new RegistrarEmergencia();
                    registrarEmergencia.registrar();
                    break;
                case 2:

                    break;

                case 3:
                    // TODO atender emergencia
                    break;

                case 4:
                    // TODO mostrar estadisticas
                    break;

                case 5:
                    System.out.println("Programa terminado...");

                    break;

                default:
                    System.out.println("Opcion no validad, por favor intente de nuevo");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }

}
