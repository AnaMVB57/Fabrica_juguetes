package strategy;

import paquete.Juguete;

import java.util.List;

public class AccionEliminarPorColor implements Accion {

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        return null;
    }

    @Override
    public int getOpcion() {
        return 6;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Eliminar juguete por color";
    }
}
