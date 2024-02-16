package paquete;

import metodos.Input;
import strategy.Accion;
import strategy.AccionStrategyHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Menu {

    public static int contadorId = 1;
    private static final AccionStrategyHandler accionStrategyHandler = new AccionStrategyHandler();

    public static void mostrarMenu() throws CloneNotSupportedException {
        List<Juguete> juguetes = new ArrayList<>();
        int opcion;

        //Datos quemados utilizando Builder
        juguetes.add(Peluche.builder().id(contadorId++).materialExterior("Felpa").relleno("Algodón").color(Color.MORADO).build());
        juguetes.add(Carrito.builder().id(contadorId++).color(Color.ROJO).marca("Corvette").numeroPuertas(4).build());
        Map<Integer, Accion> accionStrategy = accionStrategyHandler.getMapeo();

        //Ciclo que mantiene el menú funcionando hasta que la opción 8 sea seleccionada
        do {
            //Menú que muestra al usuario seleccionar las opciones disponibles
            System.out.println("._____________________________________________________________________.");
            System.out.println("|                        ¡Bienvenido a PCJ S.A.!                      |");
            System.out.println("|_____________________________________________________________________|");
            accionStrategyHandler.imprimirMenu();
            opcion = Input.leerInt("Seleccione una de las opciones: ");
            accionStrategy.get(opcion).ejecutar(juguetes);

        } while (opcion != 8);
    }
}