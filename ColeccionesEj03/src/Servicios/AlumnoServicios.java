package Servicios;

import Entidades.AlumnoEntidades;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class AlumnoServicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<AlumnoEntidades> listaAlumnos = new ArrayList();
    boolean aux = false;

    public void crearAlumno() {
        while (aux == false) {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();

            System.out.println("Ingrese la primer nota del alumno");
            Integer nota1 = leer.nextInt();

            System.out.println("Ingrese la segunda nota del alumno");
            Integer nota2 = leer.nextInt();

            System.out.println("Ingrese la tercer nota del alumno");
            Integer nota3 = leer.nextInt();

            ArrayList<Integer> notas = new ArrayList();
            notas.add(nota1);
            notas.add(nota2);
            notas.add(nota3);

            AlumnoEntidades alumno1 = new AlumnoEntidades(nombre, notas);
            listaAlumnos.add(alumno1);
            System.out.println("Desea agregar otro alumno? (S/N)");
            String rpta = leer.next();
            if (rpta.equalsIgnoreCase("n")) aux = true;
        }
    }
    
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno a saber la nota"); 
        String nombre = leer.next();
        
        listaAlumnos.forEach((AlumnoEntidades i) -> {
            if(i.getNombre().equalsIgnoreCase(nombre)){
                Integer resultado = 0;
                for (Integer nota : i.getNotas()) {
                    resultado += nota;
                }
                double promedio = resultado / i.getNotas().size();
                System.out.println("La nota final del alumno " + nombre + " es " + promedio);
            }
        });
    }
}
