package paquete;

public class Carrito implements Juguete, Cloneable {

    //Variables
    private String color;
    private String marca;
    int numeroPuertas;
    int id;

    public Carrito() {
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
//        Carrito copia = new Carrito();
//        copia.color = this.getColor();
//        copia.marca = this.getMarca();
//        copia.numeroPuertas = this.getNumeroPuertas();
//        return copia;
//    }

    public Carrito clone() throws CloneNotSupportedException {
        return (Carrito) super.clone();
    }

//______________________________________________________________________________________________________________________
    public static class Builder {

        private Carrito carrito;

        public Builder() {
            this.carrito = new Carrito();
        }

        public Carrito.Builder id(int id) {
            this.carrito.setId(id);
            return this;
        }

        public Carrito.Builder marca(String marca) {
            this.carrito.marca = marca;
            return this;
        }

        public Carrito.Builder numeroPuertas(int numeroPuertas) {
            this.carrito.numeroPuertas = numeroPuertas;
            return this;
        }

        public Carrito.Builder color(String color) {
            this.carrito.color = color;
            return this;
        }

        public Carrito build() {
            return this.carrito;
        }

    }


}
