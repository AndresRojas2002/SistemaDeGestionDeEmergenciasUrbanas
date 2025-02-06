package view;

import java.util.List;
import java.util.Scanner;

import controller.SistemaEmergencia;

import model.Emergencia;


public class AtenderEmergencia {
   
    SistemaEmergencia sistema = new SistemaEmergencia();
   

    public void atenderEmergenciaMenu(SistemaEmergencia sistema, Scanner sc) {
        List<Emergencia> pendientes = sistema.getEmergenciasPendientes();
        if (pendientes.isEmpty()) {
            System.err.println("\n\u001B[31mNo hay emergencias pendientes.\u001B[0m");
            return;
        }

        System.out.println("\n\u001B[34m=== ATENDER EMERGENCIA ===\u001B[0m\n");
        for (int i = 0; i < pendientes.size(); i++) {
            System.out.println((i + 1) + ". " + pendientes.get(i).getDescripcion());
        }
        System.out.print("\n\u001B[35mSeleccione el número de la emergencia a atender: \u001B[0m");
        int indice = sc.nextInt()-1;
       // int indice = Integer.parseInt(sc.nextLine()) - 1;
        if (indice < 0 || indice >= pendientes.size()) {
            System.err.println("\n\u001B[31mÍndice inválido.\u001B[0m");
            return;
        }

        Emergencia emergencia = pendientes.get(indice);
        sistema.asignarRecursosAEmergencia(emergencia);
        sistema.atenderEmergencia(emergencia);
    }}

   

//     private IRespuestaEmergencia asignarRecursoCorrespondiente(SistemaEmergencia sistema, Emergencia emergencia) {
//         List<IRespuestaEmergencia> recursosDisponibles = sistema.filtrarRecursosDisponibles();
    
//         for (IRespuestaEmergencia recurso : recursosDisponibles) {
//             if ((emergencia instanceof Robo && recurso instanceof Policia) ||
//                 (emergencia instanceof Incendio && recurso instanceof Bomberos) ||
//                 (emergencia instanceof AccidenteVehicular && recurso instanceof Ambulancia)) {
                
//                 return recurso; // Devuelve el recurso correcto
//             }
//         }
//         return null; // No se encontró un recurso adecuado
//     }}


// public class AtenderEmergencia {

//     public void atenderEmergenciaMenu(SistemaEmergencia sistema, Scanner sc) {
//         List<Emergencia> pendientes = sistema.getEmergenciasPendientes();
//         if (pendientes.isEmpty()) {
//             System.out.println("No hay emergencias pendientes.");
//             return;
//         }

//         System.out.println("\n=== ATENDER EMERGENCIA ===");
//         for (int i = 0; i < pendientes.size(); i++) {
//             System.out.println((i + 1) + ". " + pendientes.get(i).getDescripcion());
//         }


//         System.out.print("Seleccione el número de la emergencia a atender: ");

//         int indice = sc.nextInt()-1;
        
       

//         if (indice < 0 || indice >= pendientes.size()) {
//             System.out.println("Índice inválido.");
//             return;
//         }

//         Emergencia emergencia = pendientes.get(indice);
//         IRespuestaEmergencia recursoAsignado = asignarRecursoCorrespondiente(sistema, emergencia);

//         if (recursoAsignado == null) {
//             System.out.println("No hay recursos disponibles para esta emergencia.");
//             return;
//         }

//         sistema.asignarRecursosAEmergencia(emergencia); // Suponiendo que este método existe en SistemaEmergencia
//         sistema.atenderEmergencia(emergencia);
//         System.out.println("Emergencia atendida con éxito.");
//     }

//     private IRespuestaEmergencia asignarRecursoCorrespondiente(SistemaEmergencia sistema, Emergencia emergencia) {
//         List<IRespuestaEmergencia> recursosDisponibles = sistema.filtrarRecursosDisponibles();

//         for (IRespuestaEmergencia recurso : recursosDisponibles) {
//             if ((emergencia instanceof Robo && recurso instanceof Policia) ||
//                 (emergencia instanceof Incendio && recurso instanceof Bomberos) ||
//                 (emergencia instanceof AccidenteVehicular && recurso instanceof Ambulancia)) {
//                 return recurso;
//             }
//         }
//         return null;
//     }

    
// }
