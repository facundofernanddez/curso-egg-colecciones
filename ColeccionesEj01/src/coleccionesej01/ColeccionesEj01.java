/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package coleccionesej01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ColeccionesEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        boolean aux = false;
        
        System.out.println("Escriba una raza de perro a añadir en la lista");
        String raza = leer.next();
        razas.add(raza);
        
        while(aux == false){
            System.out.println("Desea añadir otra raza a la lista (S/N)");
            String a = leer.next();
            if (a.equalsIgnoreCase("S")){
                System.out.println("Escriba una raza de perro a añadir en la lista");
                String raza1 = leer.next();
                razas.add(raza1);
            }
            else aux = true;
        }
        
        System.out.println("Las razas en la lista son:");
        for (String i : razas){
            System.out.println(i);
        }
    }
    
}
