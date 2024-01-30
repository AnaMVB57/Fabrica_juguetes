package paquete.metodos;

import paquete.Juguete;
import paquete.Peluche;

import java.util.ArrayList;
import java.util.List;

public class ClonarJuguetes {

    public static void clonarJuguetes(int numeroDeVeces, Juguete jugueteAClonar, List<Juguete> lista) throws CloneNotSupportedException {

        // Crear una lista temporal para almacenar los elementos clonados
        List<Juguete> juguetesClonados = new ArrayList<>();

        // Iterar sobre la lista original
        //Se crea una copia del juguete dependiendo de la clase que sea
        int idInicial = lista.size() + 1;
        for(int i = 0; i < numeroDeVeces; i++) {
            Juguete copia = jugueteAClonar.clonar();
            copia.setId(idInicial++);

            //Se añaden las copias a la lista de clones
            juguetesClonados.add(copia);
        }

        // Agregar los elementos clonados a la lista principal después de completar la iteración
        lista.addAll(juguetesClonados);
    }
}