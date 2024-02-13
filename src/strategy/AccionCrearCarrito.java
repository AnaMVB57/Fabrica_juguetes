package strategy;

import factory.CreadorCarrito;
import paquete.Juguete;

import java.util.List;

public class AccionCrearCarrito implements Accion {

    private static AccionCrearCarrito instanciaAccion;

    private AccionCrearCarrito() {}

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {

        juguetes.add(new CreadorCarrito().crear());

        return juguetes;
    }

    public static Accion getInstance() {
        if (instanciaAccion == null){
            instanciaAccion = new AccionCrearCarrito();
        }else{
            throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
        }
        return instanciaAccion;
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
