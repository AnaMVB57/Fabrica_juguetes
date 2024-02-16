package strategy;

import paquete.Juguete;

import java.util.List;
import java.util.Scanner;

public interface Accion {

    List<Juguete> ejecutar(List<Juguete> juguetes) throws CloneNotSupportedException;

    Accion getInstance();   //Singleton

    int getOpcion();

    String getOpcionComoString();
}
