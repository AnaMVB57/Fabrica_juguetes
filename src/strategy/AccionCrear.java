package strategy;

import metodos.Input;
import paquete.Juguete;
import factory.CreadorCarrito;
import factory.CreadorPeluche;
import java.util.List;

public class AccionCrear implements Accion {

    private static AccionCrear instanciaAccion;

    AccionCrear(){}

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("¿Qué tipo de juguete desea crear?");
        int tipoJuguete = Input.leerInt("1. Peluche           2. Carrito");

        switch (tipoJuguete){
            case 1 -> juguetes.add(CreadorPeluche.getInstance().crear());
            case 2-> juguetes.add(CreadorCarrito.getInstance().crear());
            default -> System.out.println("*** Ingrese una opción válida ***");
        }
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null){
            instanciaAccion = new AccionCrear();
        }
        return instanciaAccion;
    }

    @Override
    public int getOpcion() {
        return 1;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Crear juguete";
    }
}