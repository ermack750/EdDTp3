package Ej2Presentacion;

public class Stack {

	private int [] datos;
	private int cuenta;
	
	public Stack() {
		datos = new int[4];
		this.cuenta = 0;
	}
	
	public void push(int dato) {
		this.datos[this.cuenta] = dato;
		this.cuenta++;
	}
	
	public int pop() {
		this.cuenta--;
		return this.datos[this.cuenta];
	}
	public boolean isEmpty() {
		return this.cuenta == 0;
	}
	public int peek() {
		return this.datos[this.cuenta -1];
	}
}
