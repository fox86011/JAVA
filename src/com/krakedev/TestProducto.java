package com.krakedev;

public class TestProducto {
	public static void main(String[] args) {
        // Crear 3 variables de tipo Producto
        Producto productoA = new Producto("Aspirina", "Analgésico", 5.50, 100);
        Producto productoB = new Producto("Ibuprofeno", "Antiinflamatorio", 7.00, 50);
        Producto productoC = new Producto("Paracetamol", "Antipirético", 4.00, 200);

        // Modificar los atributos de cada producto
        productoA.setPrecio(5.75);
        productoB.setStockActual(45);
        productoC.setDescripcion("Antipirético y analgésico");

        // Mostrar en pantalla los valores de los atributos de los 3 objetos
        productoA.mostrarInfo();
        productoB.mostrarInfo();
        productoC.mostrarInfo();
    }

}
