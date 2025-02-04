import java.util.Random;

import utils.TipoRecursos;

public class Recursos {

    private int cantidadPolicias;
    private int cantidadBomberos;
    private int cantidadAmbulancia;

    public Recursos() {
        Random aleatorio = new Random();
        this.cantidadPolicias = aleatorio.nextInt(15);
        this.cantidadBomberos = aleatorio.nextInt(19);
        this.cantidadAmbulancia = aleatorio.nextInt(12);
    }

    public void utilizarRecurso(TipoRecursos tipo, int cantidad) {
        switch (tipo) {
            case POLICIAS:
                if (cantidadPolicias >= cantidad) {
                    cantidadPolicias -= cantidad;
                    System.out.println("Usando " + cantidad + " polias. Quedan: " + cantidadPolicias);

                } else {
                    System.out.println("No hay suficientes policias ");
                }

                break;

            case AMBULANCIAS:
                if (cantidadAmbulancia >= cantidad) {
                    cantidadAmbulancia -= cantidad;
                    System.out.println("Usando " + cantidad + " ambulancias. Quedan: " + cantidadAmbulancia);
                } else {
                    System.out.println("No hay suficientes ambulancias.");
                }
                break;

            case BOMBEROS:
                if (cantidadBomberos >= cantidad) {
                    cantidadBomberos -= cantidad;
                    System.out.println("Usando " + cantidad + " bomberos. Quedan: " + cantidadBomberos);
                } else {
                    System.out.println("No hay suficientes bomberos.");
                }
                break;

            default:
                break;
        }
    }

    public int getPolicias() {
        return cantidadPolicias;
    }

    public int getBomberos() {
        return cantidadBomberos;
    }

    public int getAmbulancia() {
        return cantidadAmbulancia;
    }

}
