package strategy;

import paquete.Juguete;

import java.util.InputMismatchException;
import java.util.List;

import static paquete.metodos.ClonarJuguetes.clonarJuguetes;
import static paquete.metodos.MostrarJuguetes.mostrarJuguetes;

public class AccionClonar implements Accion {

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        //El usuario indica qué juguete quiere clonar, cuántas veces y los añade a la lista
        //Validacion de datos
        boolean continua;
        do {
            try {
                continua = false;
                System.out.println("Ingrese el id del juguete que desea clonar: ");
                int idJugueteClonar = scanner.nextInt();
                System.out.println("¿Cuántas copias desea crear? ");
                int numVeces = scanner.nextInt();
                //Ciclo que ejecuta la función clonarJuguetes las veces que indique el usuario
                Juguete jugueteAClonar = juguetes.get(idJugueteClonar - 1);
                clonarJuguetes(numVeces, jugueteAClonar, juguetes);
            } catch (InputMismatchException | CloneNotSupportedException ex) {
                System.out.println("*** Ingrese un número, por favor. ***");
                scanner.next();
                continua = true;
            }
        } while (continua);
        System.out.println("            - Juguetes clonados y añadidos a la lista -             ");
        mostrarJuguetes(juguetes);
        return juguetes;
    }
}
