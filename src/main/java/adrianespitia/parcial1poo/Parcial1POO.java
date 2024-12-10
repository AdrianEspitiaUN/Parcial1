/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adrianespitia.parcial1poo;

/**
 *
 * @author Estudiante
 */
import java.lang.reflect.Array;
import java.util.*;
public class Parcial1POO {

    public static void main(String[] args) {
        //Se genera una lista inicial de platos
        Plato pasta = new Plato("Pasta napolitana", 4000);
        Plato arroz = new Plato("Arroz con pollo", 3000);
        Plato pollo = new Plato("Pollo a la plancha", 5000);
        Plato carne = new Plato("Carne en bistec", 5000);
        Plato ensalada1 = new Plato("Ensalada Cesar", 2000);
        Plato ensalada2 = new Plato("Ensalada de frutas", 2000);
        Plato torta = new Plato("Torta", 2000);
        Plato galletas = new Plato("Galletas", 2000);
        
        //Se generan tres menús distintos para los distintos días
        Menu dia1 = new Menu(pasta, pollo, torta);
        Menu dia2 = new Menu(arroz, carne, galletas);
        Menu dia3 = new Menu(ensalada1, carne, torta);
        Menu dia4 = new Menu(ensalada2, pollo, galletas);
        
        //
        Cliente mesa1 = new Cliente("Mesa 1");
        Cliente mesa2 = new Cliente("Mesa 2");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Escoja un cliente");
        int cliente = s.nextInt();
        
        Pedido ejemplo;
        if(cliente == 1){
            ejemplo = new Pedido(mesa1);
        }else{
            ejemplo = new Pedido(mesa2);
        }
        
    }
}
