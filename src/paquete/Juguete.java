package paquete;

public interface Juguete {

    int getId();

    Color getColor();

    Juguete clonar() throws CloneNotSupportedException;

    void setId(int id);
}

