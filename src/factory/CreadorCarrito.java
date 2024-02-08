package factory;

import paquete.Carrito;
import paquete.Color;
import paquete.Juguete;
import paquete.Menu;

import java.util.InputMismatchException;

public class CreadorCarrito implements Creador {

    @Override
    public Juguete crear() {

        //juguetes.add(new CreadorCarrito().crear());
        boolean continua;
        Carrito carrito = null;
        System.out.println("Marca: ");
        String marca = scanner.next();
        //Validacion de datos
        do {
            try {
                continua = false;
                System.out.println("Color: ");
                Color.mostrarColores();
                int colorCarrito = scanner.nextInt();
                System.out.println("Número de puertas: ");
                int numPuertas = scanner.nextInt();

                carrito = Carrito.builder()
                        .id(Menu.contadorId++)
                        .color(Color.colorElegido(colorCarrito)) //Convierte el color a String y lo ingresa
                        .marca(marca)
                        .numeroPuertas(numPuertas)
                        .build();
            } catch (InputMismatchException ex) {
                System.out.println("*** Ingrese un número, por favor. ***");
                scanner.next();
                continua = true;
            }
        } while (continua);

        System.out.println("                 - Carrito añadido a la lista -                      ");

        return carrito;
    }
}