package strategy;

import paquete.Peluche;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccionStrategyHandler {

    //1 -> AccionCrear
    //2 -> AccionCrear
    //3 -> AccionMostrar
    //4 -> ...

    private final List<Accion> acciones = List.of(
            new AccionCrearPeluche().getInstance(),
            new AccionCrearCarrito().getInstance(),
            new AccionMostrarLista().getInstance(),
            new AccionClonar().getInstance(),
            new AccionEliminarPorId().getInstance(),
            new AccionEliminarPorColor().getInstance(),
            new AccionMostrarPorTipo().getInstance()
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