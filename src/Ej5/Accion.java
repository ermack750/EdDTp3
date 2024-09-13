package Ej5;

public class Accion {
    private String nombre;

    public Accion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Acción: " + nombre;
    }
}
