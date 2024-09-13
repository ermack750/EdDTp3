package Ej2;

import util.Helper;

public class Main {
    public static void main(String[] args) {
        // Leer un número entero de cuatro cifras, validado con la clase Helper
        int numero = Helper.leerEnteroConCifrasExactas("Ingrese un número de 4 cifras: ", 4);

        // Descomponer el número en dígitos y almacenarlos en una pila
        Pila pila = descomponerEnPila(numero);

        // Obtener el número invertido desde la pila
        int numeroInvertido = formarNumeroDesdePila(pila);

        // Mostrar el resultado
        System.out.println("Número original: " + numero);
        System.out.println("Número invertido: " + numeroInvertido);

        // Mostrar los dígitos pares e impares del número original
        mostrarDigitosParesEImpares(numero);
    }

    // Método para descomponer un número en dígitos y cargarlos en una pila
    public static Pila descomponerEnPila(int numero) {
        Pila pila = new Pila();
        while (numero > 0) {
            int digito = numero % 10;  // Obtener el último dígito
            pila.push(digito);         // Apilar el dígito
            numero /= 10;              // Eliminar el último dígito
        }
        return pila;
    }

    // Método para formar un número desde los dígitos apilados
    public static int formarNumeroDesdePila(Pila pila) {
        int numeroInvertido = 0;
        int factor = 1;

        while (!pila.isEmpty()) {
            int digito = pila.pop();
            numeroInvertido += digito * factor;
            factor *= 10;
        }

        return numeroInvertido;
    }

    // Método para mostrar los dígitos pares e impares de un número
    public static void mostrarDigitosParesEImpares(int numero) {
        System.out.print("Dígitos pares: ");
        int temp = numero;
        while (temp > 0) {
            int digito = temp % 10;
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
            }
            temp /= 10;
        }

        System.out.print("\nDígitos impares: ");
        temp = numero;
        while (temp > 0) {
            int digito = temp % 10;
            if (digito % 2 != 0) {
                System.out.print(digito + " ");
            }
            temp /= 10;
        }
        System.out.println();
    }
}

