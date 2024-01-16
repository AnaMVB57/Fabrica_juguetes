package paquete;
public class Peluche extends Juguete {

    public String materialExterior, relleno, color;

    //Constructor del objeto Peluche con atributos propios y de la superclase Juguete
    public Peluche(String materialExterior, String relleno, String color) {
        super(idJuguete);
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
}
