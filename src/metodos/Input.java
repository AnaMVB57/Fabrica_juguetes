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
        boolean continua;
        //Validacion de datos
        int numero = 0;
        do {
            try {
                continua = false;
                System.out.println(message);
                numero = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("*** Ingrese un número, por favor. ***");
                scanner.next();
                continua = true;
            }
        } while (continua);
        scanner.nextLine(); //Registra el Enter
        return numero;
    }
}