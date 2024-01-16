package paquete;
public class Juguete {

    //Declaración de variables
    public static int idJuguete=1;

    //Constructor para crear juguetes
    public Juguete(int idJuguete) {
        this.idJuguete = generarID();
    }

    //Función para generar un id autoincrementable para los juguetes creados
    public static int generarID() {
        return idJuguete++;
    }

    //Getter de la id de los juguetes
    public int getIdJuguete() {
        return idJuguete;
    }

}
