package strategy;

import paquete.Juguete;

import java.util.List;

import static paquete.metodos.MostrarJuguetes.mostrarJuguetesPorSeparado;

public class AccionMostrarPorTipo implements Accion {

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        //Mostrar juguetes por tipo
        System.out.println("¿Qué tipo de juguete desea visualizar?");
        System.out.println("1. Peluches                2. Carritos");
        int tipoJuguete = scanner.nextInt();
        mostrarJuguetesPorSeparado(tipoJuguete, juguetes);

        return juguetes;
    }

    @Override
    public int getOpcion() {
        return 7;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Mostrar juguetes separados por tipo";
    }
}
