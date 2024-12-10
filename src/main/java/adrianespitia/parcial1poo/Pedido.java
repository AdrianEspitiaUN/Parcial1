/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrianespitia.parcial1poo;

/**
 *
 * @author Estudiante
 */
import java.lang.reflect.Array;
import java.util.*;
public class Pedido {
    Cliente cliente;
    Menu[] ordenMenus = {new Menu(), new Menu(), new Menu(), new Menu()};
    Plato[] ordenPlatos = {new Plato(), new Plato(), new Plato(), new Plato()};
    
    int total;
    boolean estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = false;
    }
    
    public void agregarMenu(Menu m){
        Array.set(ordenMenus, 0, m);
    }
    
    
}
