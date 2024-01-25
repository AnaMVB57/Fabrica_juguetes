package paquete;

public class Carrito implements Juguete, Cloneable {

    //Variables
    private String color;
    private String marca;
    int numeroPuertas;
    int id;

    //Getters y setters de los atributos de Carrito
    public String getColor() {
        return color;
    }

    @Override
    public Juguete clonar() throws CloneNotSupportedException {
        return (Carrito) super.clone();
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

    // Método para clonar los atributos de Carrito
//    @Override
//    public Carrito clone() throws CloneNotSupportedException {
//        return new Carrito(this);
//    }

    /*
    * public Carrito clonarConId(int id) {
    *   Carrito nuevoCarrito = (Carrito) super.clone();
    *   nuevoCarrito.setId(id);
    *   return nuevoCarrito;
    * }
    * */

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

        public CarritoBuilder color(String color) {
            this.carrito.color = color;
            return this;
        }

        public Carrito build() {
            return this.carrito;
        }

    }


}
