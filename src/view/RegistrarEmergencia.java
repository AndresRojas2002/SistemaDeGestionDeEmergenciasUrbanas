package view;

import java.util.Scanner;

import controller.SistemaEmergencia;
import model.Emergencia;
import model.factory.EmergenciaFactory;
import utils.TipoEmergencia;
import utils.TipoNivelGravedad;
import utils.TipoUbicacion;

public class RegistrarEmergencia {

    private TipoEmergencia tipoEmergencia;
    private TipoUbicacion tipoUbicacion;
    private TipoNivelGravedad tipoNivelGravedad;
    private int tiempoRespuesta;

    
    

    public void registrar(SistemaEmergencia sistema, Scanner sc) {
    

        System.out.println("\n1. \u001B[32mIncendio\u001B[0m");
        System.out.println("2. \u001B[32mAccidente vehecular\u001B[0m");
        System.out.println("3. \u001B[32mRobo\u001B[0m ");

        System.out.print("\n\u001B[35mPor favor selecciona la emergencia: \u001B[0m");
        int opcion = sc.nextInt();
        System.out.println("-------------------------------------");
        sc.nextLine();
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
                    System.out.println("\u001B[31mOpcion no validad, por favor intente de nuevo\u001B[0m");
                    opcionValida = false;
                    break;

            }
        } while (!opcionValida);

        System.out.println("\n1.\u001B[32m Centro de la ciudad\u001B[0m");
        System.out.println("2.\u001B[32m Norte de la ciudad\u001B[0m");
        System.out.println("3.\u001B[32m Sur de la ciudad\u001B[0m");
        System.out.println("4.\u001B[32m Oriente de la ciudad\u001B[0m");
        System.out.println("5.\u001B[32m Occidente de la ciudad\u001B[0m");

        System.out.print("\n\u001B[35mPor favor seleciona la ubicacion de la emergencia: \u001B[0m");
        String ubicacion = sc.nextLine();
        System.out.println("-------------------------------------");

        switch (ubicacion) {
            case "1":
                tipoUbicacion = TipoUbicacion.CENTRO;
                break;
            case "2":
                tipoUbicacion = TipoUbicacion.NORTE;
                break;
            case "3":
                tipoUbicacion = TipoUbicacion.SUR;
                break;
            case "4":
                tipoUbicacion = TipoUbicacion.ORIENTE;
                break;
            case "5":
                tipoUbicacion = TipoUbicacion.OCCIDENTE;
                break;
            default:
                System.out.println("\u001B[31mOpcion no validad, por favor intente de nuevo\u001B[0m");
                break;
        }

        System.out.println("\n1.\u001B[32m Emergencia moderada\u001B[0m");
        System.out.println("2.\u001B[32m Emergencia grave\u001B[0m");
        System.out.println("3.\u001B[32m Emergencia critica\u001B[0m ");

        System.out.print("\n\u001B[35mPor favor selecciona el nivel de gravedad de la emergencia: \u001B[0m");
        int nivelGravedad = sc.nextInt();
        System.out.println("-------------------------------------");

        switch (nivelGravedad) {
            case 1:
                tipoNivelGravedad = TipoNivelGravedad.MODERADA;
                break;
            case 2:
                tipoNivelGravedad = TipoNivelGravedad.GRAVE;
                break;
            case 3:
                tipoNivelGravedad = TipoNivelGravedad.CRITICA;
                break;
            default:
                tipoNivelGravedad = TipoNivelGravedad.MODERADA;
                break;
        }

        System.out.print("\n\u001B[32mIngrese tiempo estimado de atención (minutos): \u001B[0m");
        tiempoRespuesta = sc.nextInt();
        System.out.println("-------------------------------------");

        Emergencia nueva = EmergenciaFactory.getEmergencia(tipoEmergencia, tipoUbicacion, tipoNivelGravedad, tiempoRespuesta);
        if (nueva == null) {
            System.out.println("Tipo de emergencia inválido.");
            return;
        }

        sistema.registrarNuevaEmergencia(nueva);
        System.out.println("Emergencia registrada: " + nueva);
    }


    public TipoEmergencia getTipoEmergencia() {
        return tipoEmergencia;
    }

    public TipoUbicacion getTipoUbicacion() {
        return tipoUbicacion;
    }

    public TipoNivelGravedad getTipoNivelGravedad() {
        return tipoNivelGravedad;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

}
