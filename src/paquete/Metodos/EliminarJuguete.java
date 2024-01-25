package paquete.Metodos;
import paquete.Juguete;
import java.util.List;

public class EliminarJuguete {

    /*
    Eliminar juguete: el usuario debe especificar el ID del juguete que quiere eliminar,
    para posteriormente ser removido de la lista.
     */

    //Método que recibe como parámetros el id del Juguete y la lista de juguetes
    public static void eliminarJuguetes(int idJuguete, List<Juguete> lista){

        //Método que elimina el juguete que coincida con la id ingresada por el usuario
        lista.removeIf(jugueteBuscado -> jugueteBuscado.getId() == idJuguete);
    }

}
