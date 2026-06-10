/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.transporte_productos;


public class Transporte_Productos {

    public static void main(String[] args) {
        
        Vehiculo carro = new Carro("Toyota Hilux",1.020 );
        Vehiculo moto = new Moto("Yamaha ", 100);
        Vehiculo avion = new Avion("Airbus A320",150);
        System.out.println("   CARRO ");
        carro.mostrarDatos();
        carro.transportar();

        System.out.println("   MOTO ");
        moto.mostrarDatos();
        moto.transportar();

        System.out.println("   AVION ");
        avion.mostrarDatos();
        avion.transportar();
        
        System.out.println("    CALCULO DE DISTANCIAS ");
        System.out.println("       Distancia(velocidad)");
        System.out.println("Carro: "+carro.calcularDistancia(80)+"km");
        System.out.println("Moto: "+moto.calcularDistancia(60)+"km");
        System.out.println("Avion: "+avion.calcularDistancia(700)+"km");
        System.out.println("      Distancia(velocidad y tiempo)");
        System.out.println("Carro: "+carro.calcularDistancia(80, 2)+"km");
        System.out.println("Moto: "+moto.calcularDistancia(60, 2)+"km");
        System.out.println("Avion: "+ avion.calcularDistancia(700, 2)+"km");
        System.out.println("      Distancia(velocidad,tiempo y eficiencia)");
        System.out.println("Carro: "+carro.calcularDistancia(80, 3, 0.9)+"km");
        System.out.println("Moto: "+moto.calcularDistancia(60, 2, 0.8)+"km");
        System.out.println("Avion: "+ avion.calcularDistancia(700, 2, 0.95)+"km");

    }
}
