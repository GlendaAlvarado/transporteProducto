/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transporte_productos;

/**
 *
 * @author alvar
 */
public class Carro extends Vehiculo {

    public Carro(String nombre, double capacidad) {
        super(nombre, capacidad);
    }
    @Override
    public void transportar() {
        System.out.println("El carro transporta productos por carretera de forma eficiente.");
    }
}