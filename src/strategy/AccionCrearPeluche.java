package strategy;

import factory.CreadorPeluche;
import paquete.Juguete;

import java.util.List;

public class AccionCrearPeluche implements Accion {

    private static AccionCrearPeluche instanciaAccion;
//    private static int contadorInstancia=0;
//
//    private void instanciaAccionCrearPeluche(int contadorInstancia) {
//        if (contadorInstancia == 1) {
//            System.out.println("Se ha creado una instancia de AccionCrearPeluche.");
//        }else if(contadorInstancia > 1){
//            System.out.println("Se han creado DOS instancias de AccionCrearPeluche.");
//        }
//    }

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {

        juguetes.add(new CreadorPeluche().crear());
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionCrearPeluche();
        } else {
            throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
        }
        return instanciaAccion;
    }

    @Override
    public int getOpcion() {
        return 1;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Crear peluche";
    }
}
