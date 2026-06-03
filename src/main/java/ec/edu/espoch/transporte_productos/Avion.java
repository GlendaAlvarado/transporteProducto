/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transporte_productos;

/**
 *
 * @author alvar
 */
public class Avion extends Vehiculo {
    
    @Override
    public void transportar() {
        System.out.println(">El avion transporta productos grandes o internacionales de forma rapida por aire.");
    }
}