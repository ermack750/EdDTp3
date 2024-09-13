package Ej3;

import java.util.Stack;

public class GPS {
    private Stack<Ruta> pilaRutas;
    private Stack<Ruta> pilaDeshacer;

    // Constructor para inicializar las pilas
    public GPS() {
        this.pilaRutas = new Stack<>();
        this.pilaDeshacer = new Stack<>();
    }

    // Método para agregar una nueva ruta
    public void agregarRuta(Ruta ruta) {
        pilaRutas.push(ruta);
        pilaDeshacer.clear();  // Limpiar la pila de deshacer porque hay una nueva acción
        System.out.println("Ruta agregada: " + ruta);
    }

    // Metodo para deshacer la última ruta agregada
    public void deshacerRuta() {
        if (!pilaRutas.isEmpty()) {
            Ruta rutaDeshecha = pilaRutas.pop();
            pilaDeshacer.push(rutaDeshecha);
            System.out.println("Ruta deshecha: " + rutaDeshecha);
        } else {
            System.out.println("No hay rutas para deshacer.");
        }
    }

    // Metodo para rehacer una ruta deshecha
    public void rehacerRuta() {
        if (!pilaDeshacer.isEmpty()) {
            Ruta rutaRehecha = pilaDeshacer.pop();
            pilaRutas.push(rutaRehecha);
            System.out.println("Ruta rehecha: " + rutaRehecha);
        } else {
            System.out.println("No hay rutas para rehacer.");
        }
    }

    // Metodo para ver la última ruta agregada (la ruta actual)
    public void verRutaActual() {
        if (!pilaRutas.isEmpty()) {
            System.out.println("Ruta actual: " + pilaRutas.peek());
        } else {
            System.out.println("No hay rutas actuales.");
        }
    }

    // Metodo para ver el historial completo de rutas
    public void verHistorialCompleto() {
        if (!pilaRutas.isEmpty()) {
            System.out.println("Historial completo de rutas:");
            for (Ruta ruta : pilaRutas) {
                System.out.println(ruta);
            }
        } else {
            System.out.println("No hay rutas en el historial.");
        }
    }
}
