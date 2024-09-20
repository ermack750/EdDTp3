package Ej2Presentacion;

import java.util.Scanner;

public class Validaciones {
	
	private static Scanner ingresar = new Scanner(System.in);
	
	public static int validarNumero() {       
		while (true) {
			mostrar("Ingrese un numero entero de 4  cifras!");
			String numero = ingresar.nextLine();
			if (numero.length() == 4) {
				try {
					int numeroValido = Integer.parseInt(numero);
					mostrar("Se ingreso el numero correctamente!");
					continuar();
					return numeroValido;
					
				} catch (NumberFormatException e) {
					mostrar("No se ingresaron numeros!");
					mostrar("Intente nuevamente!");
					continuar();
				}
			}
			if (numero.length()> 4) {
				mostrar("Se ingresaron mas caracteres de los solicitados...");
				mostrar("Intente nuevamente!");
				continuar();
			}
			if (numero.length() < 4) {
				mostrar("Se ingresaron menos caracteres de los solicitados...");
				mostrar("Intente nuevamente!");
				continuar();
			}
		}
	}
	
	public static String separarNumero(int numero) {
		mostrar("Se esta separando el numero en cifras individuales");
		String numeroCifras = String.valueOf(numero);
		return numeroCifras;
		
	}
	
	public static void continuar() {
		mostrar("Presione enter para continuar...");
		ingresar.nextLine();
	}
	
	public static void mostrar(Object mensaje) {
		System.out.println(mensaje);
	}
	
}
