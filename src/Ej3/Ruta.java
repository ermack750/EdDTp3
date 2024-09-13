package Ej3;

public class Ruta {
    private String origen;
    private String destino;
    private double distancia;  // en kilómetros

    // Constructor para inicializar los atributos
    public Ruta(String origen, String destino, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    // Metodo para representar la información de la ruta
    @Override
    public String toString() {
        return "Ruta de " + origen + " a " + destino + " - Distancia: " + distancia + " km";
    }
}
