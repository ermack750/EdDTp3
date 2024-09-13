package Ej2;

import java.util.Stack;

public class Pila {
    private Stack<Integer> pila;

    public Pila() {
        this.pila = new Stack<>();
    }

    public void push(int numero) {
        pila.push(numero);
    }

    public int pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return -1; // Valor de error si la pila está vacía
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public int size() {
        return pila.size();
    }
}
