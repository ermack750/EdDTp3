package Ej4;

import java.util.Stack;

public class HistorialNavegacion {
    private Stack<SitioWeb> historial;

    public HistorialNavegacion() {
        this.historial = new Stack<>();
    }

    // Agregar sitio web al historial
    public void agregarSitio(SitioWeb sitio) {
        historial.push(sitio);
    }

    // Buscar sitio web por nombre o URL sin perder el historial
    public SitioWeb buscarSitio(String criterio) {
        Stack<SitioWeb> pilaAuxiliar = new Stack<>();
        SitioWeb sitioEncontrado = null;

        // Recorrer el historial buscando el sitio
        while (!historial.isEmpty()) {
            SitioWeb sitio = historial.pop();
            if (sitio.getNombre().equalsIgnoreCase(criterio) || sitio.getUrl().equalsIgnoreCase(criterio)) {
                sitioEncontrado = sitio;
                break;
            }
            pilaAuxiliar.push(sitio);
        }

        // Restaurar el historial desde la pila auxiliar
        while (!pilaAuxiliar.isEmpty()) {
            historial.push(pilaAuxiliar.pop());
        }

        return sitioEncontrado;
    }

    // Mostrar el historial completo
    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay sitios en el historial.");
        } else {
            for (SitioWeb sitio : historial) {
                System.out.println(sitio);
            }
        }
    }

    // Contar sitios por tipo
    public void contarSitiosPorTipo() {
        int educativo = 0, entretenimiento = 0, noticias = 0, comercioElectronico = 0;

        for (SitioWeb sitio : historial) {
            switch (sitio.getTipo().toLowerCase()) {
                case "educativo":
                    educativo++;
                    break;
                case "entretenimiento":
                    entretenimiento++;
                    break;
                case "noticias":
                    noticias++;
                    break;
                case "comercio electrónico":
                    comercioElectronico++;
                    break;
            }
        }

        System.out.println("Total sitios web visitados: " + historial.size());
        System.out.println("Educativo: " + educativo);
        System.out.println("Entretenimiento: " + entretenimiento);
        System.out.println("Noticias: " + noticias);
        System.out.println("Comercio Electrónico: " + comercioElectronico);
    }
}

