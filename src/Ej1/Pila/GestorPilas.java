package Ej1.Pila;

import java.util.Random;

public class GestorPilas {
    private static final String[] palabrasInformaticas = {
            "programa", "algoritmo", "variable", "clase", "objeto",
            "compilador", "pila", "memoria", "proceso", "hilo"
    };

    public static Pila crearPilaAleatoria() {
        Pila pila = new Pila();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int indexAleatorio = random.nextInt(palabrasInformaticas.length);
            String palabraSeleccionada = palabrasInformaticas[indexAleatorio];
            pila.push(palabraSeleccionada);
        }
        return pila;
    }

    public static int eliminarPalabrasDePila(Pila pila, String[] palabrasUsuario) {
        Pila pilaAuxiliar = new Pila();
        int eliminadas = 0;

        for (String palabra : palabrasUsuario) {
            while (!pila.isEmpty()) {
                String palabraPila = pila.pop();
                if (palabraPila.equals(palabra)) {
                    eliminadas++;
                } else {
                    pilaAuxiliar.push(palabraPila);
                }
            }

            // Restaurar la pila original desde la pila auxiliar
            while (!pilaAuxiliar.isEmpty()) {
                pila.push(pilaAuxiliar.pop());
            }
        }

        return eliminadas;
    }
}
