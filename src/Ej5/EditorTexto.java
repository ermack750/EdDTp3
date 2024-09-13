package Ej5;

import java.util.Stack;
import java.util.Random;

public class EditorTexto {
    private Stack<Accion> pilaDeshacer;
    private Stack<Accion> pilaRehacer;

    public EditorTexto() {
        this.pilaDeshacer = new Stack<>();
        this.pilaRehacer = new Stack<>();
    }

    // Agregar acción a la pila de deshacer
    public void realizarAccion(Accion accion) {
        pilaDeshacer.push(accion);
        pilaRehacer.clear(); // Limpiar la pila de rehacer al realizar una nueva acción
        System.out.println("Acción realizada: " + accion);
    }

    // Deshacer varias acciones de manera aleatoria
    public void deshacerAcciones() {
        if (pilaDeshacer.isEmpty()) {
            System.out.println("No hay acciones para deshacer.");
            return;
        }

        Random random = new Random();
        int accionesADeshacer = random.nextInt(pilaDeshacer.size()) + 1; // Número aleatorio de acciones a deshacer
        System.out.println("Deshaciendo " + accionesADeshacer + " acción(es)...");

        for (int i = 0; i < accionesADeshacer; i++) {
            Accion accion = pilaDeshacer.pop();
            pilaRehacer.push(accion);
            System.out.println("Deshecho: " + accion);
        }
    }

    // Rehacer acciones a petición del usuario
    public void rehacerAcciones(int cantidad) {
        if (pilaRehacer.isEmpty()) {
            System.out.println("No hay acciones para rehacer.");
            return;
        }

        int accionesRehechas = 0;
        for (int i = 0; i < cantidad && !pilaRehacer.isEmpty(); i++) {
            Accion accion = pilaRehacer.pop();
            pilaDeshacer.push(accion);
            System.out.println("Rehecho: " + accion);
            accionesRehechas++;

            // Informar si la acción es de formato
            if (esFormato(accion)) {
                System.out.println("Acción de formato rehecha: " + accion);
            }
        }

        System.out.println("Total de acciones rehechas: " + accionesRehechas);
    }

    // Verificar si una acción es de formato
    private boolean esFormato(Accion accion) {
        String[] accionesFormato = {"negrita", "cursiva", "subrayado"};
        for (String formato : accionesFormato) {
            if (accion.getNombre().equalsIgnoreCase(formato)) {
                return true;
            }
        }
        return false;
    }

    // Mostrar historial de acciones
    public void mostrarHistorialDeshacer() {
        System.out.println("Historial de acciones (Deshacer):");
        if (pilaDeshacer.isEmpty()) {
            System.out.println("No hay acciones realizadas.");
        } else {
            for (Accion accion : pilaDeshacer) {
                System.out.println(accion);
            }
        }
    }
}
