package strategy;

import paquete.Juguete;

import java.util.List;
import java.util.Scanner;

public interface Accion {
    Scanner scanner = new Scanner(System.in); //public static final

    List<Juguete> ejecutar(List<Juguete> juguetes);

    Accion getInstance();   //Singleton

    int getOpcion();

    String getOpcionComoString();
}
