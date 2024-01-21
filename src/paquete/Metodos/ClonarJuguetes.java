package paquete.Metodos;

import paquete.Carrito;
import paquete.Juguete;
import paquete.Peluche;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClonarJuguetes {

    public static void clonarJuguetes(int idJuguete, List<Juguete> lista) throws CloneNotSupportedException {

        // Crear una lista temporal para almacenar los elementos clonados
        List<Juguete> juguetesClonados = new ArrayList<>();

        // Iterar sobre la lista original
        Iterator<Juguete> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Juguete jugueteBuscado = iterator.next();

            //Condicional que compara el id del juguete a clonar con el id indicado por el usuario
            if (jugueteBuscado.getId() == idJuguete) {
                if (jugueteBuscado instanceof Peluche) {
                    //Se crea una copia del juguete dependiendo de la clase que sea
                    Peluche original = (Peluche) jugueteBuscado;
                    Peluche copia = original.clone();

                    //Se añaden las copias a la lista de clones
                    juguetesClonados.add(copia);

                } else if (jugueteBuscado instanceof Carrito) {
                    //Se crea una copia del juguete dependiendo de la clase que sea
                    Carrito original = (Carrito) jugueteBuscado;
                    Carrito copia = original.clone();
                    //Se añaden las copias a la lista de clones
                    juguetesClonados.add(copia);
                }
            }
        }
        // Agregar los elementos clonados a la lista principal después de completar la iteración
        lista.addAll(juguetesClonados);
        }
    }

