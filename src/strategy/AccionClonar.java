package strategy;

import metodos.Input;
import paquete.Juguete;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class AccionClonar implements Accion {

    private static AccionClonar instanciaAccion;

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) throws CloneNotSupportedException {
        //El usuario indica qué juguete quiere clonar, cuántas veces y los añade a la lista
        int idJugueteClonar = Input.leerInt("Ingrese el id del juguete que desea clonar: ");
        int numVeces = Input.leerInt("¿Cuántas copias desea crear? ");
        //Ciclo que ejecuta la función clonarJuguetes las veces que indique el usuario
        Juguete jugueteAClonar = juguetes.get(idJugueteClonar - 1);
        clonarJuguetes(numVeces, jugueteAClonar, juguetes);
        System.out.println("            - Juguetes clonados y añadidos a la lista -             ");
        AccionMostrarLista.mostrarJuguetes(juguetes);
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionClonar();
        }
        return instanciaAccion;
    }

    public void clonarJuguetes(int numeroDeVeces, Juguete jugueteAClonar, List<Juguete> lista) throws CloneNotSupportedException {

        // Crear una lista temporal para almacenar los elementos clonados
        List<Juguete> juguetesClonados = new ArrayList<>();

        // Iterar sobre la lista original
        //Se crea una copia del juguete dependiendo de la clase que sea
        int idInicial = lista.size() + 1;
        for (int i = 0; i < numeroDeVeces; i++) {
            Juguete copia = jugueteAClonar.clonar();
            copia.setId(idInicial++);

            //Se añaden las copias a la lista de clones
            juguetesClonados.add(copia);
        }

        // Agregar los elementos clonados a la lista principal después de completar la iteración
        lista.addAll(juguetesClonados);
    }

    @Override
    public int getOpcion() {
        return 3;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Clonar juguete";
    }
}
