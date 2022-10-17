package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {
    HashSet<String> paises = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPais(){
        boolean aux = false;
        
        while(aux == false){
            System.out.println("ESCRIBA EL NOMBRE DEL PAIS");
            String nombre = leer.next();
            
            Pais miPais = new Pais(nombre);
            paises.add(miPais.getNombre());
            
            System.out.println("DESEA AGREGAR OTRO PAIS? (S/N)");
            String rpta = leer.next();
            
            if (rpta.equalsIgnoreCase("n")) {
                aux = true;
                System.out.println("LOS PAISES INGRESADOS SON LOS SIGUIENTES:");
                paises.forEach((i) -> System.out.println(i));
            }
        }
    }
    
    public void ordenarSet(){
        ArrayList<String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        System.out.println("LA LISTA ORDENADA ALFABETICAMENTE QUEDA DE LA SIGUIENTE MANERA");
        paisesLista.forEach((i) -> System.out.println(i));
    }
    
    public void eliminarPais(){
        System.out.println("INGRESE UN PAIS A BUSCAR Y ELIMINAR");
        String buscar = leer.next();
        
        Iterator iterator = paises.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(buscar)) {
                iterator.remove();
                System.out.println("");
                System.out.println("LA LISTA RENOVADA QUEDA DE LA SIGUIENTE MANERA");
                paises.forEach((i) -> System.out.println(i));
                break;
            }
            else if(iterator.hasNext() == false) System.out.println("NO SE ENCONTRO EL PAIS EN LA LISTA");
        }
    }
}
