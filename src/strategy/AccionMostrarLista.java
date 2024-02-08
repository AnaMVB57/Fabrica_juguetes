package strategy;

import paquete.Juguete;

import java.util.List;

public class AccionMostrarLista implements Accion{


    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {

        AccionMostrarLista.mostrarJuguetes(juguetes);

        return juguetes;
    }

    //Función que imprime todos los juguetes de la lista, utilizando los respectivos métodos toString de los objetos en la lista
    public static void mostrarJuguetes(List<Juguete> juguetes) {
        System.out.println("______________________________________________________________________");
        for (Juguete juguete : juguetes) {
            System.out.println(juguete.toString());
        }
        System.out.println("______________________________________________________________________");
    }

    @Override
    public int getOpcion() {
        return 3;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Mostrar registro de juguetes";
    }
}
