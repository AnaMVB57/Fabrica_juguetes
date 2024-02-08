package strategy;

import paquete.Color;
import paquete.Juguete;

import java.util.InputMismatchException;
import java.util.List;

public class AccionEliminarPorColor implements Accion {

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        boolean continua;
        //Validacion de datos
        do {
            try {
                continua = false;
                System.out.println("Ingrese el color del juguete que desea eliminar: ");
                Color.mostrarColores();
                int colorABorrar = scanner.nextInt();
                juguetes.removeIf(jugueteBuscado -> jugueteBuscado.getColor().equals(Color.colorElegido(colorABorrar)));
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
    public int getOpcion() {
        return 6;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Eliminar juguetes por color";
    }
}
