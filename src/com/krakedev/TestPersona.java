package com.krakedev;

public class TestPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 30, 1.75);
        Persona persona2 = new Persona("Ana", 25, 1.60);
        Persona persona3 = new Persona("Carlos", 35, 1.80);

        persona1.imprimirDatos();
        System.out.println();
        persona2.imprimirDatos();
        System.out.println();
        persona3.imprimirDatos();
    }
}