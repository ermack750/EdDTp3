package Ej1.Pila;

import util.Helper;

public class Main {
    public static void main(String[] args) {
        // Crear la pila con 5 palabras aleatorias
        Pila pila = GestorPilas.crearPilaAleatoria();
        System.out.println("Pila inicial:");
        pila.mostrarPila();

        // Leer el número de palabras a ingresar por el usuario
        int n = Helper.leerEntero("¿Cuántas palabras desea ingresar?");
        String[] palabrasUsuario = new String[n];

        // Leer las palabras del usuario
        for (int i = 0; i < n; i++) {
            palabrasUsuario[i] = Helper.leerString("Ingrese la palabra " + (i + 1) + ": ");
        }

        // Eliminar las palabras ingresadas que están en la pila
        int eliminadas = GestorPilas.eliminarPalabrasDePila(pila, palabrasUsuario);

        // Informar el resultado
        System.out.println("Se eliminaron " + eliminadas + " palabras.");
        System.out.println("Pila final:");
        pila.mostrarPila();
    }
}

