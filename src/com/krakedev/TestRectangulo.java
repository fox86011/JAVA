package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo();
       r1.base=10;
       r1.altura=5;
       int Area=r1.calcularArea();
       System.out.println("Area de r1:"+Area);
    }

}
