import java.util.Random;
import java.util.Scanner;

public class RegistrarEmergencia {

    public void registrar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. Incendio");
        System.out.println("2. Accidente vehecular");
        System.out.println("3. Robo \n");
        System.out.print("Por favor selecciona la emergencia: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        TipoEmergencia tipoEmergencia = null;
        Boolean opcionValida;

        do {

            opcionValida = true;

            switch (opcion) {
                case 1:
                    tipoEmergencia = TipoEmergencia.INCENDIO;
                    break;

                case 2:
                    tipoEmergencia = TipoEmergencia.ACCIDENTE_VEHICULAR;
                    break;
                case 3:
                    tipoEmergencia = TipoEmergencia.ROBO;
                    break;

                default:
                    System.out.println("Opcion no validad, por favor intente de nuevo");
                    opcionValida = false;
                    break;

            }
        } while (!opcionValida);

        System.out.println("\nPor favor seleciona la ubicacion de la emergencia");
        String ubicacion = sc.nextLine();

       System.out.println("Tipos de emergencia");
       System.out.println("-------------------");
        System.out.println("1. Emergencia menor");
        System.out.println("2. Emergencia moderada");
        System.out.println("3. Emergencia grave");
        System.out.println("4. Emergencia critica");
        System.out.println("5. Emergencia vital\n");
        System.out.print("Por favor selecciona el nivel de gravedad de la emergencia:\n");
        int nivelGravedad = sc.nextInt();

        Random random = new Random();
        int tiempoRespuesta = 5 + random.nextInt(30);

        Emergencia nuevaEmergencia = EmergenciaFactory.getEmergencia(tipoEmergencia, ubicacion, nivelGravedad,
                tiempoRespuesta);

        System.out.println("\nDATOS DE LA EMERGENCIA ");
        System.out.println("----------------------");
        System.out.println("Tipo de Emergencia " + tipoEmergencia);
        System.out.println("Ubicacion " + ubicacion);
        System.out.println("nivel de gravedad " + nivelGravedad);

        sc.nextLine();

    }

}
