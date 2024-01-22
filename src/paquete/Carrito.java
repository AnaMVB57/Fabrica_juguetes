package paquete;

public class Carrito implements Juguete, Cloneable {

    //Variables
    private String color;
    private String marca;
    int numeroPuertas;
    int id;

    public Carrito(){
    }

    //Constructor del objeto Carrito con atributos propios y de la superclase Juguete
    public Carrito(int id, String color, String marca, int numeroPuertas) {
        this.id = id;
        this.color = color;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
    }

    //Getters y setters de los atributos de Carrito
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public int getId() {
        return this.id;
    }

    //Método toString sobreescrito para mostrar los atributos del objeto Carrito
    @Override
    public String toString() {
        return "Carrito - id: " + getId() +
                " | Color: " + getColor() +
                " | Marca: " + getMarca() +
                " | Número de puertas: " + getNumeroPuertas();
    }

    // En la clase Carrito
    @Override
    public Carrito clone() throws CloneNotSupportedException {
        return (Carrito) super.clone();
    }

}
