package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static paquete.Metodos.ClonarJuguetes.clonarJuguetes;
import static paquete.Metodos.EliminarJuguete.eliminarJuguetes;
import static paquete.Metodos.MostrarJuguetes.mostrarJuguetes;

/*
    Los nombres de las variables y métodos deberían ser diciente
 */

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<Juguete> juguetes = new ArrayList<Juguete>();

        juguetes.add(new Peluche(juguetes.size() + 1,"Felpa", "Algodón", "fucsia"));
        juguetes.add(new Carrito(juguetes.size() + 1,"Rojo", "MarcaX", 4));
        juguetes.add(new Peluche(juguetes.size() + 1,"Fieltro", "arena", "amarillo"));
        juguetes.add(new Carrito(juguetes.size() + 1,"Café", "Jeep", 5));
        Scanner leer = new Scanner(System.in);
        int opcion;

        //Ciclo que mantiene el menú funcionando hasta que la opción 4 sea seleccionada
        do {
            //Menú que muestra al usuario seleccionar las opciones disponibles
            System.out.println("______________________________________________________________________");
            System.out.println("                        ¡Bienvenido a PCJ S.A.!                       ");
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1: Crear peluche");
            System.out.println("2: Crear carrito");
            System.out.println("3: Imprimir registro de juguetes");
            System.out.println("4: Clonar juguete");
            System.out.println("5: Eliminar juguete");
            System.out.println("6: Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Material exterior del peluche: ");
                    String materialExterior = leer.next();
                    System.out.println("Relleno del peluche: ");
                    String relleno = leer.next();
                    System.out.println("Color del peluche: ");
                    String colorPeluche = leer.next();
                    juguetes.add(new Peluche(juguetes.size() + 1, materialExterior, relleno, colorPeluche));
                    System.out.println("                 - Peluche añadido a la lista -                      ");
                    break;

                case 2:
                    System.out.println("Color: ");
                    String colorCarrito = leer.next();
                    System.out.println("Marca: ");
                    String marca = leer.next();
                    System.out.println("Número de puertas: ");
                    int numPuertas = leer.nextInt();
                    juguetes.add(new Carrito(juguetes.size() + 1, colorCarrito, marca, numPuertas));
                    System.out.println("                 - Carrito añadido a la lista -                      ");
                    break;

                case 3:
                    //Imprime el registro de juguetes
                    mostrarJuguetes(juguetes);
                    break;

                case 4:
                    //El usuario indica qué juguete quiere clonar, cuántas veces y los añade a la lista

                    System.out.println("Ingrese el id del juguete que desea clonar: ");
                    int idJugueteClonar = leer.nextInt();
                    System.out.println("¿Cuántas copias desea crear? ");
                    int numVeces = leer.nextInt();

                    //Ciclo que ejecuta la función clonarJuguetes las veces que indique el usuario
                    for (int i=1;i<numVeces;i++){
                        clonarJuguetes(idJugueteClonar, juguetes);   }
                    System.out.println("            - Juguete(s) clonados y añadidos a la lista -             ");
                    mostrarJuguetes(juguetes);
                    break;

                case 5:
                    //Elimina el juguete indicado por el usuario y muestra el registro de juguetes actualizado

                    System.out.println("Ingrese el id del juguete que desea eliminar: ");
                    int jugueteBorrar = leer.nextInt();
                    eliminarJuguetes(jugueteBorrar, juguetes);
                    System.out.println("                  - Juguete eliminado de la lista -                   ");
                    mostrarJuguetes(juguetes);
                    break;

                case 6:
                    //Mensaje de despedida
                    System.out.println("Muchas gracias, vuelva pronto.");
                    break;
            }
        } while (opcion != 6);

    }
}