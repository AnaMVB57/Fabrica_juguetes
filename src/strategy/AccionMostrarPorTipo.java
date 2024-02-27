package strategy;

import metodos.Input;
import paquete.Carrito;
import paquete.Juguete;
import paquete.Peluche;

import java.util.List;

public class AccionMostrarPorTipo implements Accion {

    private static AccionMostrarPorTipo instanciaAccion;

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {

        System.out.println("Ingrese el tipo de juguete que desea mostrar: ");
        int tipoJuguete = Input.leerInt("1. Peluches                       2. Carritos");

        if (tipoJuguete == 1) {
            System.out.println("________________________PELUCHES______________________________________");
            for (Juguete juguete : juguetes) {
                if (juguete instanceof Peluche) {
                    System.out.println(juguete.toString());
                }
            }
        }else {
            System.out.println("________________________CARRITOS______________________________________");
            for (Juguete juguete : juguetes) {
                if (juguete instanceof Carrito) {
                    System.out.println(juguete.toString());
                }
            }
        }
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null){
            instanciaAccion = new AccionMostrarPorTipo();
        }
        return instanciaAccion;
    }

    @Override
    public int getOpcion() {
        return 6;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Mostrar juguetes separados por tipo" ;
    }
}