package strategy;

import metodos.Input;
import paquete.Juguete;

import java.util.InputMismatchException;
import java.util.List;


public class AccionEliminarPorId implements Accion {

    private static AccionEliminarPorId instanciaAccion;

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        //Elimina el juguete indicado por el usuario y muestra el registro de juguetes actualizado

        int idJuguete = Input.leerInt("Ingrese el id del juguete que desea eliminar: ");

        //Método que elimina el juguete que coincida con la id ingresada por el usuario
        juguetes.removeIf(jugueteBuscado -> jugueteBuscado.getId() == idJuguete);

        System.out.println("                  - Juguete(s) eliminado(s) de la lista -                   ");
        AccionMostrarLista.mostrarJuguetes(juguetes);
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionEliminarPorId();
        }
        return instanciaAccion;
    }

    @Override
    public int getOpcion() {
        return 5;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Eliminar juguete por id";
    }
}
