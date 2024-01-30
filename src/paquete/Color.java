package paquete;

import java.lang.reflect.Array;
import java.util.Arrays;

public enum Color {
    ROJO,
    AZUL,
    AMARILLO,
    MORADO,
    VERDE,
    NARANJA,
    CAFE,
    NEGRO,
    BLANCO;

    static {
        Color[] valores = values();
        for(int i = 0; i < valores.length; i++) {
            valores[i].id = i+1;
        }
    }

    private int id;

    public static void mostrarColores() {
        Color[] colores = values();
        for (Color color : colores) {     //Ciclo que recorre e imprime el array de colores
            System.out.println(color.id + ". " + color);
        }
    }

    public static Color colorElegido(int idColor) {
        Color[] colores = values();
        for (Color color : colores) {
            if (idColor == color.id) {
                return color;
            }
        }
        return null;
    }
}



