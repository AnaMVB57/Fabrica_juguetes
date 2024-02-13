package strategy;

import paquete.Juguete;

import java.util.List;
import java.util.Scanner;

public interface Accion {
    Scanner scanner = new Scanner(System.in); //public static final

    List<Juguete> ejecutar(List<Juguete> juguetes);

    int getOpcion();

    String getOpcionComoString();
}
