package strategy;

import paquete.Juguete;

import java.util.InputMismatchException;
import java.util.List;


public class AccionEliminarPorId implements Accion {

    private static AccionEliminarPorId instanciaAccion;

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        //Elimina el juguete indicado por el usuario y muestra el registro de juguetes actualizado
        //Validacion de datos
        boolean continua;
        do {
            try {
                continua = false;
                System.out.println("Ingrese el id del juguete que desea eliminar: ");
                int idJuguete = scanner.nextInt();

                //Método que elimina el juguete que coincida con la id ingresada por el usuario
                juguetes.removeIf(jugueteBuscado -> jugueteBuscado.getId() == idJuguete);

            } catch (InputMismatchException ex) {
                System.out.println("*** Ingrese un número, por favor. ***");
                scanner.next();
                continua = true;
            }
        } while (continua);
        System.out.println("                  - Juguete(s) eliminado(s) de la lista -                   ");
        AccionMostrarLista.mostrarJuguetes(juguetes);
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null){
            instanciaAccion = new AccionEliminarPorId();
        }else {
            throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
        }
        return instanciaAccion;    }

    @Override
    public int getOpcion() {
        return 5;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Eliminar juguete por id";
    }
}
