package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo();
       r1.base=10;
       r1.altura=5;
       int Area=r1.calcularArea();
       System.out.println("Area de r1:"+Area);
       double Perimetro1=r1.calcularPerimetro();
       System.out.println("Perimetro de r1:"+Perimetro1);
       Rectangulo r2 = new Rectangulo();
       r2.base=8;
       r2.altura=3;
       int Area2=r2.calcularArea();
       System.out.println("Area de r2:"+Area2);
       double Perimetro2=r2.calcularPerimetro();
       System.out.println("Perimetro de r2:"+Perimetro2);
    }

}
