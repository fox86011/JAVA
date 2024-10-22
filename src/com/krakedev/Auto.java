package com.krakedev;

public class Auto {
	// Atributos
    private String marca;
    private int anio;
    private double precio;
    
 // Constructor
    public Auto(String marca, int anio, double precio) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    // Métodos para modificar y obtener los atributos
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar información del auto
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Año: " + anio + ", Precio: " + precio);
    }
}
