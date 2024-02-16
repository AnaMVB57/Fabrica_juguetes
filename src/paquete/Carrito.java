package paquete;

public class Carrito implements Juguete, Cloneable {

    //Variables
    private Color color;
    private String marca;
    int numeroPuertas;
    int id;

    //Getters y setters de los atributos de Carrito
    public Color getColor() {
        return color;
    }

    @Override
    public Juguete clonar() throws CloneNotSupportedException {
        return (Carrito) super.clone(); // builder().id(this.id).numeroPuertas(this.relleno).build();
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setId(int id) {this.id = id;}

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

    public static CarritoBuilder builder() {
        return new CarritoBuilder();
    }

//______________________________________________________________________________________________________________________
    public static class CarritoBuilder {

        private Carrito carrito;

        private CarritoBuilder() {
            this.carrito = new Carrito();
        }

        public CarritoBuilder id(int id) {
            this.carrito.setId(id);
            return this;
        }

        public CarritoBuilder marca(String marca) {
            this.carrito.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas(int numeroPuertas) {
            this.carrito.numeroPuertas = numeroPuertas;
            return this;
        }

        public CarritoBuilder color(Color color) {
            this.carrito.color = color;
            return this;
        }

        public Carrito build() {
            return this.carrito;
        }

    }
}
