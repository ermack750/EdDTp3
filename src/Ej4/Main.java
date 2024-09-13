package Ej4;

import util.Helper;

public class Main {
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = Helper.leerEntero("Elija una opción: ");

            switch (opcion) {
                case 1:
                    agregarSitio(historial);
                    break;
                case 2:
                    buscarSitio(historial);
                    break;
                case 3:
                    historial.mostrarHistorial();
                    break;
                case 4:
                    historial.contarSitiosPorTipo();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            Helper.presionaTeclaParaContinuar();  // Esperar antes de continuar
        }
    }

    // Menú principal
    private static void mostrarMenu() {
        System.out.println("\nHistorial de Navegación - Opciones:");
        System.out.println("1. Agregar nuevo sitio web");
        System.out.println("2. Buscar sitio web (por nombre o URL)");
        System.out.println("3. Ver historial completo");
        System.out.println("4. Ver conteo de sitios por tipo");
        System.out.println("5. Salir");
    }

    // Agregar un nuevo sitio al historial
    private static void agregarSitio(HistorialNavegacion historial) {
        String nombre = Helper.leerString("Ingrese el nombre del sitio: ");
        String tipo = Helper.leerString("Ingrese el tipo de sitio (educativo, entretenimiento, noticias, comercio electrónico): ");
        String url = Helper.leerString("Ingrese la URL del sitio: ");

        SitioWeb sitio = new SitioWeb(nombre, tipo, url);
        historial.agregarSitio(sitio);
        System.out.println("Sitio agregado al historial.");
    }

    // Buscar un sitio por nombre o URL
    private static void buscarSitio(HistorialNavegacion historial) {
        String criterio = Helper.leerString("Ingrese el nombre o URL del sitio a buscar: ");
        SitioWeb encontrado = historial.buscarSitio(criterio);

        if (encontrado != null) {
            System.out.println("Sitio encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró el sitio en el historial.");
        }
    }
}
