package strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccionStrategyHandler {
    // static pertenece a la clase
    // sin static pertenece al objeto

    //Strategy (sustituir un switch)
    //Builder (para construir de forma flexible)
    //Factory (para crear objetos)
    //Singleton (tener clases que manejan una única instancia)
    //Prototype (Generar clones)
    //Proxy (Composición)

    private final List<Accion> acciones = List.of(
            AccionCrearPeluche.getInstance(),
            AccionCrearCarrito.getInstance(),
            AccionMostrarLista.getInstance(),
            AccionClonar.getInstance(),
            AccionEliminarPorId.getInstance(),
            AccionEliminarPorColor.getInstance(),
            AccionMostrarPorTipo.getInstance()
    );

    private final Map<Integer, Accion> mapeo;

    public AccionStrategyHandler() {
        this.mapeo = new HashMap<>();
        for(Accion accion : acciones) {
            mapeo.put(accion.getOpcion(), accion);
        }
    }

    public Map<Integer, Accion> getMapeo() {
        return mapeo;
    }

    public void imprimirMenu() {
        for(Accion accion: acciones) {
            System.out.println(accion.getOpcionComoString());
        }
    }
}