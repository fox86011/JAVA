package com.krakedev;

public class TestAuto {
	public static void main(String[] args) {
        // Instanciar dos autos
        Auto auto1 = new Auto("Toyota", 2020, 20000.50);
        Auto auto2 = new Auto("Ford", 2018, 15000.75);

        // Modificar los atributos
        auto1.setPrecio(21000.00);
        auto2.setAnio(2019);

        // Mostrar los valores de los atributos
        auto1.mostrarInfo();
        auto2.mostrarInfo();
    }
}
