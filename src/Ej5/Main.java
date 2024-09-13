package Ej5;

import util.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = Helper.leerEntero("Elija una opción: ");

            switch (opcion) {
                case 1:
                    realizarAccion(editor);
                    break;
                case 2:
                    editor.deshacerAcciones();
                    break;
                case 3:
                    int cantidadRehacer = Helper.leerEntero("¿Cuántas acciones desea rehacer?: ");
                    editor.rehacerAcciones(cantidadRehacer);
                    break;
                case 4:
                    editor.mostrarHistorialDeshacer();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            Helper.presionaTeclaParaContinuar(); // Pausar antes de continuar
        }
    }

    // Menú principal
    private static void mostrarMenu() {
        System.out.println("\nEditor de Texto - Opciones:");
        System.out.println("1. Realizar acción");
        System.out.println("2. Deshacer acción");
        System.out.println("3. Rehacer acción");
        System.out.println("4. Ver historial de acciones");
        System.out.println("5. Salir");
    }

    // Método para realizar una acción
    private static void realizarAccion(EditorTexto editor) {
        System.out.println("Acciones disponibles:");
        System.out.println("1. Negrita");
        System.out.println("2. Cursiva");
        System.out.println("3. Subrayado");
        System.out.println("4. Insertar tabla");
        System.out.println("5. Insertar imagen");
        System.out.println("6. Escribir texto");
        System.out.println("7. Borrar texto");

        int opcionAccion = Helper.leerEntero("Seleccione una acción: ");
        Accion accion = null;

        switch (opcionAccion) {
            case 1:
                accion = new Accion("negrita");
                break;
            case 2:
                accion = new Accion("cursiva");
                break;
            case 3:
                accion = new Accion("subrayado");
                break;
            case 4:
                accion = new Accion("insertar tabla");
                break;
            case 5:
                accion = new Accion("insertar imagen");
                break;
            case 6:
                accion = new Accion("escribir texto");
                break;
            case 7:
                accion = new Accion("borrar texto");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        if (accion != null) {
            editor.realizarAccion(accion);
        }
    }
}
