package entidad;

import java.util.Comparator;

public class Pelicula {
    
    // atributos
    private String titulo;
    private String director;
    private Integer duracion;

    // constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    // metodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator<Pelicula> mayMen = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());
    
    public static Comparator<Pelicula> menMay = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());
    
    public static Comparator<Pelicula> ordTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
    
    public static Comparator<Pelicula> ordDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
}
