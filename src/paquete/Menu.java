package paquete;

import strategy.Accion;
import strategy.AccionStrategyHandler;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public static int contadorId = 1;
    private static final AccionStrategyHandler accionStrategyHandler = new AccionStrategyHandler();

    public static void mostrarMenu() {
        boolean continua;
        List<Juguete> juguetes = new ArrayList<>();
        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        //Datos quemados utilizando Builder
        juguetes.add(Peluche.builder().id(contadorId++).materialExterior("Felpa").relleno("Algodón").color(Color.MORADO).build());
        juguetes.add(Carrito.builder().id(contadorId++).color(Color.ROJO).marca("Corvette").numeroPuertas(4).build());
        Map<Integer, Accion> accionStrategy = accionStrategyHandler.getMapeo();

        //Ciclo que mantiene el menú funcionando hasta que la opción 4 sea seleccionada
        do {

            //Menú que muestra al usuario seleccionar las opciones disponibles
            System.out.println("______________________________________________________________________");
            System.out.println("                        ¡Bienvenido a PCJ S.A.!                       ");
            System.out.println("Seleccione una de las siguientes opciones:");
            accionStrategyHandler.imprimirMenu();
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

            /*switch (opcion) {
                case 1 ->     //Creación de un peluche con Builder
                        juguetes.add(new CreadorPeluche().crear());
                case 2 -> juguetes.add(new CreadorCarrito().crear());
                case 3 -> mostrarJuguetes(juguetes);
                case 4 -> new AccionClonar().ejecutar(juguetes);
                case 5 -> new AccionEliminarPorId().ejecutar(juguetes);
                case 6 -> new AccionEliminarPorColor().ejecutar(juguetes);
                case 7 -> new AccionMostrarPorTipo().ejecutar(juguetes);
                case 8 ->    //Mensaje de despedida
                        System.out.println("Muchas gracias, vuelva pronto.");
            }*/

            if (opcion < 8){
                accionStrategy.get(opcion).ejecutar(juguetes);
            }else if (opcion == 8){
                System.out.println("Muchas gracias, vuelva pronto.");
            }
        } while (opcion != 8);
    }
}
