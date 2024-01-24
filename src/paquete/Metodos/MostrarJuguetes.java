package paquete.Metodos;

import paquete.Juguete;

import java.util.List;

public class MostrarJuguetes {

    //Función que imprime todos los juguetes de la lista, utilizando los respectivos métodos toString de los objetos en la lista
    public static void mostrarJuguetes(List<Juguete> lista) {
        System.out.println("______________________________________________________________________");
        for (Juguete juguete : lista) {
            System.out.println(juguete.toString());      }
        System.out.println("______________________________________________________________________");
    }
}
