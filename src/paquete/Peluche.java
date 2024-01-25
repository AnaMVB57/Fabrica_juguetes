package paquete;

/*
    Los atributos separados.
    Los atributos deberian ser private.
 */

public class Peluche implements Juguete, Cloneable {

    private String materialExterior;
    private String relleno;
    private String color;
    private int id;

    public Peluche() {
    }

    //Constructor del objeto Peluche con atributos propios y de la superclase Juguete
    public Peluche(int id, String materialExterior, String relleno, String color) {
        this.id = id;
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
    }

    //Funciones getters y setters de los atributos de Peluche

    public String getMaterialExterior() {
        return materialExterior;
    }

    public void setMaterialExterior(String materialExterior) {
        this.materialExterior = materialExterior;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {this.id = id;}

    @Override
    public int getId() {
        return this.id;
    }

    //Método toString sobreescrito para mostrar los atributos del objeto Peluche
    @Override
    public String toString() {
        return "Peluche - id: " + getId() +
                " | Material: " + getMaterialExterior() +
                " | Relleno: " + getRelleno() +
                " | Color: " + getColor();
    }

    public Peluche clone() throws CloneNotSupportedException {
        return (Peluche) super.clone();
    }
//______________________________________________________________________________________________________________________
     public static class Builder {

        private Peluche peluche;

        public Builder(){
            this.peluche = new Peluche();
        }

        public Builder id(int id) {
            this.peluche.setId(id);
            return this;
        }

        public Builder materialExterior(String materialExterior){
            this.peluche.materialExterior = materialExterior;
            return this;
        }

         public Builder relleno(String relleno){
            this.peluche.relleno = relleno;
            return this;
        }

        public Builder color(String color){
            this.peluche.color = color;
            return this;
        }

        public Peluche build(){
            return this.peluche;
        }

    }

}