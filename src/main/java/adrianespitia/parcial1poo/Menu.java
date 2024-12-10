/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrianespitia.parcial1poo;

/**
 *
 * @author Estudiante
 */
public class Menu {
    Plato acompanamiento;
    Plato platoFuerte;
    Plato postre;
    int precio;

    public Menu(Plato acompanamiento, Plato platoFuerte, Plato postre) {
        this.acompanamiento = acompanamiento;
        this.platoFuerte = platoFuerte;
        this.postre = postre;
        precio = acompanamiento.getPrecio() + platoFuerte.getPrecio() + postre.getPrecio();
    }

    public Menu() {
        this.acompanamiento = new Plato();
        this.platoFuerte = new Plato();
        this.postre = new Plato();
        this.precio = 0;
    }
    
    
    public int getPrecio() {
        return precio;
    }
   
    
    
    
}
