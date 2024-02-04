package paquete;

import factory.CreadorCarrito;
import factory.CreadorPeluche;
import strategy.AccionClonar;
import strategy.AccionEliminarPorColor;
import strategy.AccionEliminarPorId;
import strategy.AccionMostrarPorTipo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static paquete.metodos.MostrarJuguetes.mostrarJuguetes;

public class Menu {

    public static int contadorId = 1;

    public static void mostrarMenu() {
        boolean continua;
        List<Juguete> juguetes = new ArrayList<>();
        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        //Datos quemados utilizando Builder
        juguetes.add(Peluche.builder().id(contadorId++).materialExterior("Felpa").relleno("Algodón").color(Color.MORADO).build());
        juguetes.add(Carrito.builder().id(contadorId++).color(Color.ROJO).marca("Corvette").numeroPuertas(4).build());

        //Ciclo que mantiene el menú funcionando hasta que la opción 4 sea seleccionada
        do {

            //Menú que muestra al usuario seleccionar las opciones disponibles
            System.out.println("______________________________________________________________________");
            System.out.println("                        ¡Bienvenido a PCJ S.A.!                       ");
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1: Crear peluche");
            System.out.println("2: Crear carrito");
            System.out.println("3: Mostrar registro de juguetes");
            System.out.println("4: Clonar juguete");
            System.out.println("5: Eliminar juguete por id");
            System.out.println("6: Eliminar juguete por color");
            System.out.println("7: Mostrar juguetes separados por tipo");
            System.out.println("8: Salir");

            //Validacion de datos
            do {
                try {
                    continua = false;
                    opcion = leer.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("*** Ingrese un número, por favor. ***");
                    leer.next();
                    continua = true;
                }
            } while (continua);

            switch (opcion) {

                case 1:     //Creación de un peluche con Builder
                    juguetes.add(new CreadorPeluche().crear());
                    break;

                case 2:
                    juguetes.add(new CreadorCarrito().crear());
                    break;

                case 3:
                    mostrarJuguetes(juguetes);
                    break;

                case 4:
                    new AccionClonar().ejecutar(juguetes);
                    break;

                case 5:
                    new AccionEliminarPorId().ejecutar(juguetes);
                    break;

                case 6:
                    new AccionEliminarPorColor().ejecutar(juguetes);
                    break;

                case 7:
                    new AccionMostrarPorTipo().ejecutar(juguetes);
                    break;

                case 8:    //Mensaje de despedida
                    System.out.println("Muchas gracias, vuelva pronto.");
                    break;
            }
        } while (opcion != 8);
    }
}
