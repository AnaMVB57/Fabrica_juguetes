package main;

import paquete.*;   //Importamos todas las clases

import java.util.*;

import static paquete.metodos.ClonarJuguetes.clonarJuguetes;
import static paquete.metodos.EliminarJuguete.eliminarJuguetes;
import static paquete.metodos.EliminarJuguete.eliminarPorColor;
import static paquete.metodos.MostrarJuguetes.mostrarJuguetes;
import static paquete.metodos.MostrarJuguetes.mostrarJuguetesPorSeparado;

public class Main {

    public static void main(String[] args) {
        Menu.mostrarMenu();
    }
}