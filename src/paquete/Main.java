package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Los nombres de las variables y métodos deberían ser diciente
 */

public class Main {

//    Creación:
//    a. Implementación para la creación de Peluche, en la cual se le pedirá al
//    usuario ingresar los atributos materialExterior, relleno y color.
//    b. Implementación para la creación de Carrito, en la cual se le pedirá al
//    usuario ingresar los atributos color, marca y numeroPuertas.
//    c. El elemento creado debe ser agregado a la lista.
//
//            Registro:
//    Imprimir todos los juguetes que se llevan hasta ahora en la lista, con
//    sus respectivos atributos.

    public static void main(String[] args) {

        List<Juguete> juguetes = new ArrayList<Juguete>();

//        Peluche Lotso = new Peluche("Felpa", "Algodón", "fucsia");
//        Carrito McQueen = new Carrito("Azul", "MarcaX", 4);
//        Carrito MattE = new Carrito("café", "Jeep", 4);
//        Peluche Jake = new Peluche("Fieltro", "arena", "amarillo");
//        juguetes.add(Lotso);
//        juguetes.add(Jake);
//        juguetes.add(McQueen);
//        juguetes.add(MattE);
        Scanner leer = new Scanner(System.in);
        int opc;

        //Ciclo que mantiene el menú funcionando hasta que la opción 4 sea seleccionada
        do {
            //Menú que muestra al usuario seleccionar las opciones disponibles
            System.out.println("___________________________________________");
            System.out.println("¡Bienvenido a PCJ S.A.!");
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1: Crear peluche");
            System.out.println("2: Crear carrito");
            System.out.println("3: Imprimir registro de juguetes");
            System.out.println("4: Salir");
            opc = leer.nextInt();
            switch (opc) {

                case 1:
                    System.out.println("Material exterior del peluche: ");
                    String materialExterior = leer.next();
                    System.out.println("Relleno del peluche: ");
                    String relleno = leer.next();
                    System.out.println("Color del peluche: ");
                    String colorPeluche = leer.next();
                    juguetes.add(new Peluche(juguetes.size() + 1, materialExterior, relleno, colorPeluche));
                    System.out.println("- Peluche añadido a la lista -");
                    break;

                case 2:
                    System.out.println("Color: ");
                    String colorCarrito = leer.next();
                    System.out.println("Marca: ");
                    String marca = leer.next();
                    System.out.println("Número de puertas: ");
                    int numPuertas = leer.nextInt();
                    juguetes.add(new Carrito(juguetes.size() + 1, colorCarrito, marca, numPuertas));
                    System.out.println("- Carrito añadido a la lista -");
                    break;

                case 3:
                    //Imprime el registro de juguetes
                    imprimirJuguetes(juguetes);
                    break;
                case 4:
                    //Mensaje de despedida
                    System.out.println("Muchas gracias, vuelva pronto.");
                    break;
            }
        } while (opc != 4);

    }

    //Función que imprime todos los juguetes de la lista dependiendo del tipo de juguete
    public static void imprimirJuguetes(List<Juguete> lista) {
        for (Juguete juguete : lista) {
            System.out.println(juguete.toString());
        }
    }
}
