package paquete;

import factory.CreadorPeluche;
import strategy.AccionClonar;
import strategy.AccionEliminarPorId;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static paquete.metodos.ClonarJuguetes.clonarJuguetes;
import static paquete.metodos.EliminarJuguete.eliminarJuguetes;
import static paquete.metodos.EliminarJuguete.eliminarPorColor;
import static paquete.metodos.MostrarJuguetes.mostrarJuguetes;
import static paquete.metodos.MostrarJuguetes.mostrarJuguetesPorSeparado;

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
                case 2:     //Creación de un carrito con Builder
                    //juguetes.add(new CreadorCarrito().crear());
                    System.out.println("Marca: ");
                    String marca = leer.next();
                    //Validacion de datos
                    do {
                        try {
                            continua = false;
                            System.out.println("Color: ");
                            Color.mostrarColores();
                            int colorCarrito = leer.nextInt();
                            System.out.println("Número de puertas: ");
                            int numPuertas = leer.nextInt();

                            Carrito nuevoCarrito = Carrito.builder()
                                    .id(juguetes.size() + 1)
                                    .color(Color.colorElegido(colorCarrito)) //Convierte el color a String y lo ingresa
                                    .marca(marca)
                                    .numeroPuertas(numPuertas)
                                    .build();
                            juguetes.add(nuevoCarrito);
                        } catch (InputMismatchException ex) {
                            System.out.println("*** Ingrese un número, por favor. ***");
                            leer.next();
                            continua = true;
                        }
                    } while (continua);

                    System.out.println("                 - Carrito añadido a la lista -                      ");
                    break;
                case 3:
                    //Imprime el registro de juguetes
                    mostrarJuguetes(juguetes);
                    break;
                case 4:
                    new AccionClonar().ejecutar(juguetes);
                    break;
                case 5:
                    new AccionEliminarPorId().ejecutar(juguetes);
                    break;
                case 6:     //Eliminar juguetes por color
                    //Validacion de datos
                    do {
                        try {
                            continua = false;
                            System.out.println("Ingrese el color del juguete que desea eliminar: ");
                            Color.mostrarColores();
                            int colorABorrar = leer.nextInt();
                            eliminarPorColor(Color.colorElegido(colorABorrar), juguetes);   //Llama el método que elige el color y
                        } catch (InputMismatchException ex) {                   //lo utiliza como parámetro para la función de eliminar
                            System.out.println("*** Ingrese un número, por favor. ***");
                            leer.next();
                            continua = true;
                        }
                    } while (continua);
                    break;

                case 7:     //Mostrar juguetes por tipo
                    System.out.println("¿Qué tipo de juguete desea visualizar?");
                    System.out.println("1. Peluches                2. Carritos");
                    int tipoJuguete = leer.nextInt();
                    mostrarJuguetesPorSeparado(tipoJuguete, juguetes);
                    break;

                case 8:
                    //Mensaje de despedida
                    System.out.println("Muchas gracias, vuelva pronto.");
                    break;
            }
        } while (opcion != 8);
    }
}
