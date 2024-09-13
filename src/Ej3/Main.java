package Ej3;

import util.Helper;

public class Main {
    public static void main(String[] args) {
        GPS gps = new GPS();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSistema de GPS - Opciones:");
            System.out.println("1. Agregar nueva ruta");
            System.out.println("2. Deshacer última ruta");
            System.out.println("3. Rehacer última ruta deshecha");
            System.out.println("4. Ver ruta actual");
            System.out.println("5. Ver historial completo de rutas");
            System.out.println("6. Salir");

            int opcion = Helper.leerEntero("Elija una opción: ");

            switch (opcion) {
                case 1:
                    agregarRuta(gps);
                    break;
                case 2:
                    gps.deshacerRuta();
                    break;
                case 3:
                    gps.rehacerRuta();
                    break;
                case 4:
                    gps.verRutaActual();
                    break;
                case 5:
                    gps.verHistorialCompleto();
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Método para agregar una nueva ruta, con validación de datos
    private static void agregarRuta(GPS gps) {
        String origen = Helper.leerString("Ingrese el origen de la ruta: ");
        String destino = Helper.leerString("Ingrese el destino de la ruta: ");
        double distancia = Helper.leerDouble("Ingrese la distancia de la ruta (km): ");
        Ruta ruta = new Ruta(origen, destino, distancia);
        gps.agregarRuta(ruta);
    }
}
