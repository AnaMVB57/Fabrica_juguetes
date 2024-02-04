package strategy;

import paquete.Color;
import paquete.Juguete;

import java.util.InputMismatchException;
import java.util.List;

import static paquete.metodos.EliminarJuguete.eliminarPorColor;
import static paquete.metodos.MostrarJuguetes.mostrarJuguetes;

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
                eliminarPorColor(Color.colorElegido(colorABorrar), juguetes);   //Llama el método que elige el color y
            } catch (InputMismatchException ex) {                   //lo utiliza como parámetro para la función de eliminar
                System.out.println("*** Ingrese un número, por favor. ***");
                scanner.next();
                continua = true;
            }
        } while (continua);
        System.out.println("                  - Juguete(s) eliminado(s) de la lista -                   ");
        mostrarJuguetes(juguetes);

        return juguetes;
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
