
package ec.edu.espoch.transporte_productos;

/**
 *
 * @author alvar
 */
public class Moto extends Vehiculo {

    public Moto(String nombre, double capacidad) {
        super(nombre, capacidad);
    }
    
    @Override
    public void transportar() {
        System.out.println("La moto transporta productos pequenios rapidamente en areas urbanas.");
    }
}