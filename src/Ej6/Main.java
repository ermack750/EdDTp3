package Ej6;

import java.util.Scanner;
import util.Helper;

public class Main {
    public static void main(String[] args) {
        Navegacion navegacion = new Navegacion();
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            String comando = Helper.leerString("Ingrese un comando: ");

            if (comando.equalsIgnoreCase("Salir")) {
                System.out.println("Última categoría visitada: " + navegacion.historial.peek());
                continuar = false;
            } else if (comando.startsWith("Ir a ")) {
                String categoria = comando.substring(5);
                navegacion.irACategoria(categoria);
            } else if (comando.equalsIgnoreCase("Volver")) {
                navegacion.volver();
            } else if (comando.equalsIgnoreCase("Ver actual")) {
                navegacion.verCategoriaActual();
            } else if (comando.equalsIgnoreCase("Ver total navegado")) {
                navegacion.verTotalNavegado();
            } else if (comando.startsWith("Buscar ")) {
                String categoria = comando.substring(7);
                navegacion.buscarCategoria(categoria);
            } else if (comando.equalsIgnoreCase("Vaciar historial")) {
                navegacion.vaciarHistorial();
            } else {
                System.out.println("Comando no reconocido. Intente nuevamente.");
            }
            Helper.presionaTeclaParaContinuar();
        }
    }

    // Método para mostrar el menú de opciones
    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Navegación ---");
        System.out.println("Comandos disponibles:");
        System.out.println("Ir a [Categoría] - Navegar a una nueva categoría.");
        System.out.println("Volver - Retroceder a la categoría anterior.");
        System.out.println("Ver actual - Mostrar la categoría actual.");
        System.out.println("Ver total navegado - Mostrar cuántas categorías se han navegado.");
        System.out.println("Buscar [Categoría] - Buscar una categoría en el historial.");
        System.out.println("Vaciar historial - Borrar el historial de navegación.");
        System.out.println("Salir - Terminar el programa.");
    }
}
