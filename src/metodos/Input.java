package metodos;

import java.util.InputMismatchException;

public class Input {

    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static String leerTexto(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

//Método que lee números enteros y valida el tipo de dato
    public static Integer leerInt(String message) {
        System.out.println(message);
        int numero = 0;
        boolean continua = true ;
        //Validacion de datos
        do {
            try {
                numero = scanner.nextInt();
                continua = false;
            } catch (InputMismatchException ex) {
                System.out.println("*** Ingrese un número, por favor. ***");
            }
            scanner.nextLine(); //Registra el Enter
        } while (continua);
        return numero;
    }
}