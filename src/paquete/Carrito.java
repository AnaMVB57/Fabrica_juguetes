package paquete;
public class Carrito extends Juguete{

    //Variables
    String color, marca;
    int numeroPuertas;

    //Constructor del objeto Carrito con atributos propios y de la superclase Juguete
    public Carrito(String color, String marca, int numeroPuertas) {
        super(idJuguete);
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
}
