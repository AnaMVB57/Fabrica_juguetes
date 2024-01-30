package paquete.metodos;

import paquete.Carrito;
import paquete.Juguete;
import paquete.Peluche;

import java.util.List;

public class MostrarJuguetes {

    //Función que imprime todos los juguetes de la lista, utilizando los respectivos métodos toString de los objetos en la lista
    public static void mostrarJuguetes(List<Juguete> lista) {
        System.out.println("______________________________________________________________________");
        for (Juguete juguete : lista) {
            System.out.println(juguete.toString());
        }
        System.out.println("______________________________________________________________________");
    }

    public static void mostrarJuguetesPorSeparado(int tipoJuguete, List<Juguete> lista) {
        if (tipoJuguete == 1) {
            System.out.println("________________________PELUCHES_______________________________________");
            for (Juguete juguete : lista) {
                if (juguete instanceof Peluche) {
                    System.out.println(juguete.toString());
                }
            }
        }else {
            System.out.println("________________________CARRITOS_______________________________________");
            for (Juguete juguete : lista) {
                if (juguete instanceof Carrito) {
                    System.out.println(juguete.toString());
                }
            }
        }
    }
}