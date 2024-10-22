package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	public int calcularArea() {
		int resultado=base*altura;
		return resultado;
	}
	public double calcularPerimetro() {
		double resultado=(2*base)+(2*altura);
		return resultado;
	}
	

}
