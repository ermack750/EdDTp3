package Ej1.Pila;

import java.util.Stack;

public class Pila {
    private Stack<String> pila;

    public Pila() {
        this.pila = new Stack<>();
    }

    public void push(String palabra) {
        pila.push(palabra);
    }

    public String pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }

    public String peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        }
        return null;
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public boolean contiene(String palabra) {
        return pila.contains(palabra);
    }

    public void mostrarPila() {
        if (!pila.isEmpty()) {
            System.out.println("Palabras en la pila: " + pila);
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public int size() {
        return pila.size();
    }
}
