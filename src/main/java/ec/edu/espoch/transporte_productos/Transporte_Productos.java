/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.transporte_productos;


public class Transporte_Productos {

    public static void main(String[] args) {
        
        Vehiculo carro = new Carro();
        Vehiculo moto = new Moto();
        Vehiculo avion = new Avion();

        System.out.println("MODOS DE TRANSPORTE ");
        carro.transportar();
        moto.transportar();
        avion.transportar();

        System.out.println("CALCULO DE DISTANCIAS ");
        
        double distCarro = carro.calcularDistancia(80);
        System.out.println("Distancia Carro : " + distCarro + " km");
        
        double distMoto = moto.calcularDistancia(60, 3);
        System.out.println("Distancia Moto : " + distMoto + " km");
        
        double distAvion = avion.calcularDistancia(850, 2, 0.95);
        System.out.println("Distancia Avion: " + distAvion + " km");
    }
}
