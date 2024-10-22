package com.krakedev;

public class TestCuadrado {
	public static void main(String[] args) {
	       Cuadrado c1=new Cuadrado();
	       Cuadrado c2=new Cuadrado();
	       Cuadrado c3=new Cuadrado();
	       c1.lado=10;
	       c2.lado=10;
	       c3.lado=10;
	       double Area1=c1.area();
	       System.out.println("Area de c1:"+Area1);
	       double Perimetro1=c1.perimetro();
	       System.out.println("Perimetro de c1:"+Perimetro1);
	       double Area2=c2.area();
	       System.out.println("Area de c1:"+Area2);
	       double Perimetro2=c2.perimetro();
	       System.out.println("Perimetro de c1:"+Perimetro2);
	       double Area3=c3.area();
	       System.out.println("Area de c1:"+Area3);
	       double Perimetro3=c3.perimetro();
	       System.out.println("Perimetro de c1:"+Perimetro3);
	    }

}
