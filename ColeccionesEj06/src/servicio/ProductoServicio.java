package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> productos = new HashMap();

    public void introducirElemento() {
        boolean aux = false;

        while (aux == false) {
            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
            String nombre = leer.next();

            System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
            double precio = leer.nextDouble();

            Producto nuevoProducto = new Producto(nombre, precio);
            productos.put(nombre, precio);

            System.out.println("DESEA INTRODUCIR UN NUEVO PRODUCTO? (S/N)");
            String rpta = leer.next();

            if (rpta.equalsIgnoreCase("n")) {
                aux = true;
            }
        }
    }

    public void modificarPrecio() {
        System.out.println("INTRODUZCA EL NOMBRE DEL PRODUCTO A CAMBIAR DE PRECIO");
        String producto = leer.next();
        
        System.out.println("INTRODUZCA EL PRECIO DEL PRODUCTO");
        Double precio = leer.nextDouble();
        
        productos.remove(producto);
        productos.put(producto, precio);
        
        System.out.println("SE HA MODIFICADO EL PRECIO DEL PRODUCTO");
    }
    
    public void eliminarProducto() {
        System.out.println("INTRODUZCA EL NOMBRE DEL PRODUCTO A ELIMINAR");
        String producto = leer.next();
        
        productos.remove(producto);
        System.out.println("SE HA ELIMINADO EL PRODUCTO DE LA LISTA");
    }

    public void mostrarProductos() {
        System.out.println("LOS PRODUCTOS DE LA LISTA SON");
        productos.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + ", precio: $" + entry.getValue());
        });
    }

    public void menu() {
        boolean aux = false;

        while (aux == false) {
            System.out.println("");
            System.out.println("INGRESE EL NUMERO DE OPERACION QUE DESEA REALIZAR: ");
            System.out.println("1 - MOSTRAR LISTA DE PRODUCTOS");
            System.out.println("2 - INTRODUCIR NUEVO PRODUCTO A LA LISTA");
            System.out.println("3 - MODIFICAR PRECIO DE UN PRODUCTO");
            System.out.println("4 - ELIMINAR UN PRODUCTO");
            System.out.println("5 - SALIR");
            System.out.println("");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    introducirElemento();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("HASTA LA PROXIMA");
                    aux = true;
                    break;
                default:
                    System.out.println("HASTA LA PROXIMA");
                    aux = true;
                    break;
            }
        }

    }
}
