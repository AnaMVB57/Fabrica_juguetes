package strategy;

import factory.CreadorCarrito;
import paquete.Juguete;

import java.util.List;

public class AccionCrearCarrito implements Accion {

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {

        juguetes.add(new CreadorCarrito().crear());

        return juguetes;
    }

    @Override
    public int getOpcion() {
        return 2;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Crear carrito";
    }
}
