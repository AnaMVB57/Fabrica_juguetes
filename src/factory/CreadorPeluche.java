package factory;

import paquete.Color;
import paquete.Juguete;
import paquete.Menu;
import paquete.Peluche;

import java.util.InputMismatchException;

public class CreadorPeluche implements Creador {

    @Override
    public Juguete crear() {
        boolean continua;
        Peluche peluche = null;
        System.out.println("Material exterior del peluche: ");
        String materialExterior = scanner.nextLine();
        System.out.println("Relleno del peluche: ");
        String relleno = scanner.nextLine();
        System.out.println("Color del peluche: ");

        //Validacion de datos
        do {
            try {
                continua = false;
                Color.mostrarColores();
                int colorPeluche = scanner.nextInt();

                peluche = Peluche.builder()
                        .id(Menu.contadorId++)
                        .materialExterior(materialExterior)
                        .relleno(relleno)
                        .color(Color.colorElegido(colorPeluche)) //Convierte el color a String y lo ingresa
                        .build();
            } catch (InputMismatchException ex) {
                System.out.println("*** Ingrese un número, por favor. ***");
                scanner.next();
                continua = true;
            }
        } while (continua);

        System.out.println("                 - Peluche añadido a la lista -                      ");

        return peluche;
    }
}
