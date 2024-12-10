/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrianespitia.parcial1poo;

/**
 *
 * @author Estudiante
 */
public class Plato {
    String Nombre;
    int precio;

    public Plato(String Nombre, int precio) {
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public Plato() {
        this.Nombre = "Ninguno";
        this.precio = 0;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
}
