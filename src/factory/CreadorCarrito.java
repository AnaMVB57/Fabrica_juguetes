package factory;

import metodos.Input;
import paquete.Carrito;
import paquete.Color;
import paquete.Juguete;
import paquete.Menu;
import strategy.Accion;
import strategy.AccionCrear;

public class CreadorCarrito implements Creador {

    private static CreadorCarrito instanciaAccion;

    @Override
    public Juguete crear() {
        String marca = Input.leerTexto("Marca: ");
        int numPuertas = Input.leerInt("Número de puertas: ");
        Carrito carrito = Carrito.builder()
                .id(Menu.contadorId++)
                .color(Color.elegirColor("Color del carrito: "))
                .marca(marca)
                .numeroPuertas(numPuertas)
                .build();
        System.out.println("                 - Carrito añadido a la lista -                      ");
        return carrito;
    }

    public static CreadorCarrito getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new CreadorCarrito();
        }
        return instanciaAccion;
    }
}