package Ej4;

public class SitioWeb {
    private String nombre;
    private String tipo;
    private String url;

    public SitioWeb(String nombre, String tipo, String url) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo: " + tipo + ", URL: " + url;
    }
}
