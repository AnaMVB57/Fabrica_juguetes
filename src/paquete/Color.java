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

    private static Color[] colores = Color.values();

    public static void mostrarColores() {
        for (int i = 0; i < colores.length; i++) {     //Ciclo que recorre e imprime el array de colores
            System.out.println(i + 1 + ". " + colores[i]);
        }
    }

    public static String colorElegido(int colorPeluche) {
        return String.valueOf(colores[colorPeluche - 1]);
    }
}



