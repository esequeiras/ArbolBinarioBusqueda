package cl;

import bl.Arbol;

public class Cl {
    public static Arbol arbol;

    public Cl() {
        this.arbol = new Arbol();
    }

    public static void insertar(int dato) {
        arbol.insertar(dato);
    }

    public static void preorden() {
        arbol.preorden();
    }

    public static void inorden() {
        arbol.inorden();
    }

    public static void postorden() {
        arbol.postorden();
    }
}
