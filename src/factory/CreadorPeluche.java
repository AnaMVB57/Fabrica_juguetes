package factory;

import metodos.Input;
import paquete.Color;
import paquete.Juguete;
import paquete.Menu;
import paquete.Peluche;

import java.util.InputMismatchException;

public class CreadorPeluche implements Creador {

    @Override
    public Juguete crear() {
        String materialExterior = Input.leerTexto("Material exterior del peluche: ");
        String relleno = Input.leerTexto("Relleno del peluche: ");
        Peluche peluche = Peluche.builder()
                .id(Menu.contadorId++)
                .materialExterior(materialExterior)
                .relleno(relleno)
                .color(Color.elegirColor("Color del peluche: ")) 
                .build();
        System.out.println("                 - Peluche añadido a la lista -                      ");
        return peluche;
    }
}