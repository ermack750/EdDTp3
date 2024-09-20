package Ej2Presentacion;

public class Numeros {

	public static void main(String[] args) {
		Validaciones.mostrar("Bienvenido!");
		
		Stack dato = new Stack();
		
		int contadorPares = 0;
		
		int contadorImpares = 0;

		int numero = Validaciones.validarNumero();
		
		/*Validaciones.mostrar(numero);*/

		String numeroValido = Validaciones.separarNumero(numero);
		
		/*Validaciones.mostrar(numeroValido);*/
		
		for (int i = 0; i < numeroValido.length(); i++) {
			int cifra = Integer.parseInt(String.valueOf(numeroValido.charAt(i)));

			if (cifra != 0) {
				if (cifra % 2 == 0) {
					contadorPares++;
				}else {
					contadorImpares++;
				}
			}
			Validaciones.mostrar(cifra);
			
			/*Validaciones.mostrar("Se agrego la "+ (i+1) + " cifra");*/
			dato.push(cifra);
		}
		Validaciones.continuar();
		
		StringBuilder numeroAlReves = new StringBuilder();
		
		
		if (!dato.isEmpty()) {
			Validaciones.mostrar("Se estan sacando los numeros");
			while (!dato.isEmpty()) {
				int cifraAfuera = dato.pop();
				numeroAlReves.append(cifraAfuera);
				Validaciones.mostrar(cifraAfuera);
				Validaciones.continuar();
			}
			
			Validaciones.mostrar("El numero original es: "+numeroValido);
			Validaciones.mostrar("La cantidad de pares en el numero original es: "+contadorPares);
			Validaciones.mostrar("La cantidad de impares en el numero original es: "+contadorImpares);
			Validaciones.mostrar("El nuevo numero es: "+numeroAlReves);
			
		}else {
			Validaciones.mostrar("La pila esta vacia...");
		}
	}

}
