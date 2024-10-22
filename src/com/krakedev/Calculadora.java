package com.krakedev;

public class Calculadora {
	public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            System.out.println("Error: División por cero");
            return Double.NaN; // NaN (Not a Number)
        }
        return dividendo / divisor;
    }

    public double promediar(double valor1, double valor2, double valor3) {
        return (valor1 + valor2 + valor3) / 3;
    }

    public void mostrarResultado() {
        System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
    }
}
