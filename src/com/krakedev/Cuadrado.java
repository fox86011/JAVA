package com.krakedev;

public class Cuadrado {
	public int lado;
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public double area() {
		double resultado=lado*lado;
		return resultado;
	}
	public double perimetro() {
		double resultado=lado*4;
		return resultado;
	}

}
