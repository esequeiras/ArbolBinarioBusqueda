package tl;

import cl.*;

import java.io.*;
public class Gestor {
    public Cl logica;

    public Gestor() {
        this.logica = new Cl();
    }
    public static void insertar(int dato){
        Cl.insertar(dato);
    }
    public  void preorden() {
        Cl.preorden();
    }

    public void inorden() {
        Cl.inorden();
    }

    public void postorden() {
        Cl.postorden();
    }
}
