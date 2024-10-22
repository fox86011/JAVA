package com.krakedev;

public class TestCalculadora {
	public static void main(String[] args) {
        Calculadora calculadora  = new Calculadora();

        // Multiplicación
        double resultadoMultiplicacion = calculadora.multiplicar(10, 5);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        // División
        double resultadoDivision = calculadora.dividir(10, 2);
        System.out.println("Resultado de la división: " + resultadoDivision);

        // Promedio
        double resultadoPromedio = calculadora.promediar(10, 8, 9);
        System.out.println("Resultado del promedio: " + resultadoPromedio);

        // Mostrar mensaje
        calculadora.mostrarResultado();
    }

}
