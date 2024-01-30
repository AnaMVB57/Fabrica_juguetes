package strategy;

import paquete.Juguete;

import java.util.InputMismatchException;
import java.util.List;

import static paquete.metodos.EliminarJuguete.eliminarJuguetes;
import static paquete.metodos.MostrarJuguetes.mostrarJuguetes;

public class AccionEliminarPorId implements Accion {

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        //Elimina el juguete indicado por el usuario y muestra el registro de juguetes actualizado
        //Validacion de datos
        boolean continua;
        do {
            try {
                continua = false;
                System.out.println("Ingrese el id del juguete que desea eliminar: ");
                int jugueteBorrar = scanner.nextInt();
                eliminarJuguetes(jugueteBorrar, juguetes);
            } catch (InputMismatchException ex) {
                System.out.println("*** Ingrese un número, por favor. ***");
                scanner.next();
                continua = true;
            }
        } while (continua);
        System.out.println("                  - Juguete(s) eliminado(s) de la lista -                   ");
        mostrarJuguetes(juguetes);
        return juguetes;
    }
}
