package factory;

import paquete.Juguete;

import java.util.Scanner;

public interface Creador {

    Scanner scanner = new Scanner(System.in);

    Juguete crear();
}
