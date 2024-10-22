package com.krakedev;

public class TestCuadrado {
	public static void main(String[] args) {
	       Cuadrado c1=new Cuadrado(10);
	       Cuadrado c2=new Cuadrado(5);
	       Cuadrado c3=new Cuadrado(2);
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
