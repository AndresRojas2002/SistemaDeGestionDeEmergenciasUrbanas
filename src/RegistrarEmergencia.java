import java.util.Random;
import java.util.Scanner;

public class RegistrarEmergencia {

    public void registrar(){
        Scanner sc = new Scanner(System.in);

    System.out.println("Por favor selecciona la emergencia");
    System.out.println("1. Incendio");
    System.out.println("2. Accidente vehecular");
    System.out.println("3. Robo");

    int opcion = sc.nextInt();
    sc.nextLine();

    TipoEmergencia tipoEmergencia = null;
    Boolean opcionValida;

    do{

    switch (opcion) {
        case 1 :
        tipoEmergencia = TipoEmergencia.INCENDIO;
    

        case 2 : 
        tipoEmergencia = TipoEmergencia.ACCIDENTE_VEHICULAR;
    

        case 3 :
         tipoEmergencia = TipoEmergencia.ROBO;
        

        default : 
        System.out.println("Opcion no validad, por favor intente de nuevo");
        opcionValida = false;
        break;
    
    
    }
    }while (!opcionValida);

    System.out.println("Por favor seleciona la ubicacion de la emergencia");
    String ubicacion = sc.nextLine();

    System.out.println("Por favor selecciona el nivel de gravedad de la emergencia:");
     int nivelGravedad = sc.nextInt();

     Random random = new Random(); 
     int tiempoRespuesta = 5 + random.nextInt(30);

     Emergencia nuevaEmergencia = EmergenciaFactory.getEmergencia(tipoEmergencia, ubicacion, nivelGravedad, tiempoRespuesta);

}

}
