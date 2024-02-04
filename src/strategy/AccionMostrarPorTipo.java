package strategy;

import paquete.Juguete;

import java.util.List;

public class AccionMostrarPorTipo implements Accion {

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        return null;
    }

    @Override
    public int getOpcion() {
        return 7;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Mostrar juguetes separados por tipo";
    }
}
