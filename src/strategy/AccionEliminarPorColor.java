package strategy;

import metodos.Input;
import paquete.Color;
import paquete.Juguete;

import java.util.List;

public class AccionEliminarPorColor implements Accion {

    private static AccionEliminarPorColor instanciaAccion;

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        Color colorABorrar = Color.elegirColor("Ingrese el color del juguete que desea eliminar: ");
        juguetes.removeIf(jugueteBuscado -> jugueteBuscado.getColor().equals(colorABorrar));
        System.out.println("                  - Juguete(s) eliminado(s) de la lista -                   ");
        AccionMostrarLista.mostrarJuguetes(juguetes);
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionEliminarPorColor();
        }
        return instanciaAccion;
    }

    @Override
    public int getOpcion() {
        return 6;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Eliminar juguetes por color";
    }
}