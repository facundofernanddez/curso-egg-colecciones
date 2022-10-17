package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void crearPelicula(){
        boolean aux = false;
        while (aux == false) {
            
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.next();
            
            System.out.println("Ingrese el director de la pelicula");
            String director = leer.next();
            
            System.out.println("Ingrese la duracion de la pelicula en horas");
            Integer hs = leer.nextInt();
            
            Pelicula peli = new Pelicula(titulo, director, hs);
            peliculas.add(peli);
            
            System.out.println("Desea agregar otra pelicula? (S/N)");
            String add = leer.next();
            
            if ("n".equalsIgnoreCase(add)) aux = true;
        }
    }
    
    public void mostrarPelis(){
        System.out.println("");
        System.out.println("LAS PELICULAS DE LA LISTA SON:");
        peliculas.forEach((i) ->  System.out.println(i.getTitulo()));
    }
    
    public void masUnaHora(){
        System.out.println("");
        System.out.println("LAS PELICULAS DE MAS DE UNA HORA SON:");
        peliculas.forEach((i) -> {
            if (i.getDuracion() > 1) System.out.println(i.getTitulo() + ", con una duracion de " + i.getDuracion() + "hs.");
        });
    }
    
    public void mayorMenor(){
        System.out.println("");
        System.out.println("LAS PELICULAS ORDENADAS DE MAYOR A MENOR QUEDAN DE LA SIGUIENTE MANERA");
        peliculas.sort(Pelicula.mayMen);
        peliculas.forEach((i) -> System.out.println(i.getTitulo() + ", " + i.getDuracion() + "hs."));
    }
    
    public void menorMayor(){
        System.out.println("");
        System.out.println("LAS PELICULAS ORDENADAS DE MENOR A MAYOR QUEDAN DE LA SIGUIENTE MANERA:");
        peliculas.sort(Pelicula.menMay);
        peliculas.forEach((i) -> System.out.println(i.getTitulo()));
    }
    
    public void ordenarPorTitulo(){
        System.out.println("");
        System.out.println("LAS PELICULAS ORDENADAS ALFABETICAMENTE QUEDAN DE LA SIGUIENTE MANERA:");
        peliculas.sort(Pelicula.ordTitulo);
        peliculas.forEach((i) -> System.out.println(i.getTitulo()));
    }
    
    public void ordenarPorDirector(){
        System.out.println("");
        System.out.println("LAS PELICULAS ORDENADAS POR DIRECTOR DE MANERA ALFABETICA QUEDAN DE LA SIGUIENTE MANERA:");
        peliculas.sort(Pelicula.ordDirector);
        peliculas.forEach((i) -> System.out.println(i.getTitulo() + ", " + i.getDirector())); 
    }
}
