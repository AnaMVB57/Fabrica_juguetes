package strategy;

import paquete.Juguete;

import java.util.List;

public class AccionSalida implements Accion{

    private static AccionSalida instanciaAccion;

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("Muchas gracias, vuelva pronto.");
        return null;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionSalida();
        }
        return instanciaAccion;
    }

    @Override
    public int getOpcion() {
        return 8;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Salir";
    }
}
