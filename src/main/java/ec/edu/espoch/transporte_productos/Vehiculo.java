/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transporte_productos;

public abstract class Vehiculo {
    private String nombre;
    private double capacidad;
   
    public Vehiculo(String nombre, double capacidad) {
    this.nombre = nombre;
    this.capacidad = capacidad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Capacidad: "+capacidad+ "kg");
    }

    public double calcularDistancia(double velocidad) {
        return velocidad * 1;
    }

    public double calcularDistancia(double velocidad, double tiempo) {
        return velocidad * tiempo;
    }

    public double calcularDistancia(double velocidad, double tiempo, double eficiencia) {
        return (velocidad * tiempo) * eficiencia;
    }

    public abstract void transportar();
    
}
