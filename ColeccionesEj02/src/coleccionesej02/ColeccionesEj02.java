/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package coleccionesej02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ColeccionesEj02 {

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
        razas.forEach((i) -> {
            System.out.println(i);
        });
        
        Iterator<String> it = razas.iterator();
        int size = razas.size();
        
        System.out.println("Escriba una raza a buscar en la lista para ser removida");
        String rem = leer.next();
        
        while(it.hasNext()){
            if (it.next().equalsIgnoreCase(rem)) it.remove();
            else if (it.hasNext() == false && razas.size() == size) System.out.println("No se ha encontrado esa raza en la lista");
        }
        
        Collections.sort(razas);
        
        Iterator<String> it2 = razas.iterator();
        System.out.println("La lista ordenada queda de esta manera:");
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
