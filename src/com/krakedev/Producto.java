package com.krakedev;

public class Producto {
	// Atributos
    private String nombre;
    private String descripcion;
    private double precio;
    private int stockActual;

    // Constructor
    public Producto(String nombre, String descripcion, double precio, int stockActual) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockActual = stockActual;
    }

    // Métodos para modificar y obtener los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStockActual() {
        return stockActual;
    }

    // Método para mostrar información del producto
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Descripción: " + descripcion + ", Precio: " + precio + ", Stock: " + stockActual);
    }
}
