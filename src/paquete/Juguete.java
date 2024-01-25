package paquete;

public interface Juguete {

    int getId();

    String getColor();

    Juguete clonar() throws CloneNotSupportedException;

    void setId(int id);
}

