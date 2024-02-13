package strategy;

import factory.CreadorPeluche;
import paquete.Juguete;

import java.util.List;

public class AccionCrearPeluche implements Accion {

    private static AccionCrearPeluche instanciaAccion; //inicialmente está en null

    private AccionCrearPeluche () {}
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

    public static Accion getInstance() {
        //Lazy loading vs Eager Loading
        if (instanciaAccion == null) {
            instanciaAccion = new AccionCrearPeluche();
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
