package view;

import java.util.List;
import java.util.Scanner;

import controller.SistemaEmergencia;
import model.Emergencia;

public class AtenderEmergencia {
    
public static void atenderEmergenciaMenu(SistemaEmergencia sistema, Scanner sc) {
        List<Emergencia> pendientes = sistema.getEmergenciasPendientes();
        if (pendientes.isEmpty()) {
            System.out.println("No hay emergencias pendientes.");
            return;
        }

        System.out.println("\n=== ATENDER EMERGENCIA ===");
        for (int i = 0; i < pendientes.size(); i++) {
            System.out.println((i + 1) + ". " + pendientes.get(i).getDescripcion());
        }
        System.out.print("Seleccione el número de la emergencia a atender: ");
        int indice = Integer.parseInt(sc.nextLine()) - 1;
        if (indice < 0 || indice >= pendientes.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Emergencia emergencia = pendientes.get(indice);
        sistema.asignarRecursosAEmergencia(emergencia);
        sistema.atenderEmergencia(emergencia);

        
    }

}
