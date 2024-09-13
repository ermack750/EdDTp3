package Ej6;

import java.util.Stack;

public class Navegacion {
    private Stack<String> historial;

    public Navegacion() {
        this.historial = new Stack<>();
        this.historial.push("Menú Principal");  // Inicializamos con "Menú Principal"
    }

    // Navegar a una nueva categoría
    public void irACategoria(String categoria) {
        historial.push(categoria);
        System.out.println("Navegaste a: " + categoria);
    }

    // Retroceder a la categoría anterior
    public void volver() {
        if (historial.size() > 1) {
            String ultimaCategoria = historial.pop();
            System.out.println("Regresaste de: " + ultimaCategoria);
        } else {
            System.out.println("Ya estás en el Menú Principal. No puedes retroceder más.");
        }
    }

    // Ver la categoría actual
    public void verCategoriaActual() {
        System.out.println("Estás en: " + historial.peek());
    }

    // Consultar cuántas categorías se han navegado
    public void verTotalNavegado() {
        System.out.println("Total de categorías navegadas: " + historial.size());
    }

    // Buscar una categoría en el historial
    public void buscarCategoria(String categoria) {
        if (historial.contains(categoria)) {
            System.out.println("La categoría '" + categoria + "' está en el historial.");
        } else {
            System.out.println("La categoría '" + categoria + "' no está en el historial.");
        }
    }

    // Vaciar el historial, dejando solo el "Menú Principal"
    public void vaciarHistorial() {
        historial.clear();
        historial.push("Menú Principal");
        System.out.println("El historial ha sido vaciado. Estás en el Menú Principal.");
    }

    // Mostrar el historial completo
    public void mostrarHistorial() {
        System.out.println("Historial de navegación:");
        for (String categoria : historial) {
            System.out.println("- " + categoria);
        }
    }
}
