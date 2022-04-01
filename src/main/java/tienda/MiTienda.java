package tienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MiTienda {

    private ArrayList<Producto> tienda;

    public MiTienda(ArrayList<Producto> tienda) {
        this.tienda = tienda;
    }

    public static void main(String[] args) {

        // 1 Crea una lista de productos y añade dos objetos de cada tipo de producto distintos

        ArrayList<Producto> catalogo = new ArrayList<Producto>();
        MiTienda tienda = new MiTienda(catalogo);

        //Conversiones Implicitas
        Producto p1 = new Pantalon(1, 32.00, "Color verde militar", "Bershka", "M");
        Producto p2 = new Pantalon(2, 40.00, "Vaqueros tradicioneles azules", "Pull and Bear", "M");
        Producto p3 = new LibroPapel(3, 20.00, "Libro para selectividad: El árbol de la ciencia", 1234567890, 200);
        Producto p4 = new LibroPapel(4, 22.00, "Libro para selectividad: El cuarto de atrás", 1234347890, 100);
        Producto p5 = new LibroDigital(5, 10.00, "Libro para selectividad: Historia de una escalera", 1235678900, 1000.00);
        Producto p6 = new LibroDigital(6, 15.00, "Libro para selectividad: Cordeluna", 11111111, 1200.00);
        Producto p7 = new Musica(7, 8.00, "Cancion de los 80: Chiquilla", "Segurdad Social");
        Producto p8 = new Musica(8, 10.00, "Cancion : Entre dos tierras", "Héroes del Silencio");
        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);
        catalogo.add(p4);
        catalogo.add(p5);
        catalogo.add(p6);
        catalogo.add(p7);


        //2 Muestra los datos de los productos usando un foreach y el método toString().

        for (Producto p : catalogo) {

            System.out.println(p);
        }
        //El metodo ToString es polimórfico ya que una misma llamada del método tiene ejecuciones para cada producto

        //3-4 Ordenar segun el precio menor a mayor
        System.out.println("----------------------");
        catalogo.sort(((o1, o2) -> Double.compare(o1.getPrecio(), o2.getPrecio())));
        catalogo.forEach(System.out::println);
        //5-6 Ordenar segun el codigo menor a mayor
        System.out.println("----------------------");
        catalogo.sort(((o1, o2) -> Integer.compare(o1.getCodigo(), o2.getCodigo())));
        catalogo.forEach(System.out::println);
        //7 Busqueda Binaria y mostrar posicion
        System.out.println("----------------------");
        Collections.binarySearch(catalogo, p1, Comparator.comparing(Producto::getCodigo));
        System.out.println(Collections.binarySearch(catalogo, p1, Comparator.comparing(Producto::getCodigo)));
        //Que no exista
        System.out.println("----------------------");
        Collections.binarySearch(catalogo, p8, Comparator.comparing(Producto::getCodigo));
        System.out.println(Collections.binarySearch(catalogo, p8, Comparator.comparing(Producto::getCodigo)));
        //8-9 Recorrer lista de productos y añadir a una lista de libros
        System.out.println("----------------------");
        ArrayList<Libro> biblioteca = new ArrayList<Libro>();
        for (Producto p : catalogo) {
            if (p instanceof Libro) {
                biblioteca.add((Libro) p);
            }
        }
        for (Libro l : biblioteca) {
            System.out.println(l);
        }
        //10-11 Ordenar ISBN
        System.out.println("----------------------");
        Collections.sort(biblioteca);
        for (Libro l : biblioteca) {
            System.out.println(l);
        }
        //12 metodos interfaces
        System.out.println("----------------------");
        for (Libro l : biblioteca) {
            if (l instanceof LibroPapel) {
                //Conversion Explícita
                ((LibroPapel) l).enviar("Mar de alborán");
            }
            if (l instanceof LibroDigital) {
                //Conversion Explícita
                ((LibroDigital) l).descargar();
            }
        }
        //Los metodos polimorficos son el toString el SeEnvia ,Se descarga, equals y hashCode

        //14 Usar contains en la lista de libros
        System.out.println("----------------------");
        System.out.println(biblioteca.contains(p4));
        //15 Lista de se envia
        System.out.println("----------------------");
        ArrayList<SeEnvia> envia = new ArrayList<SeEnvia>();

        for (Producto p : catalogo) {
            if (p instanceof SeEnvia) {
                //Convesion explicita
                envia.add((SeEnvia) p);

            }

        }
        //16 recorrer lista se envia
        System.out.println("----------------------");
        for (SeEnvia s : envia
        ) {
            s.enviar("Mar de Alaboran");
        }
        //17
        System.out.println("----------------------");

        for (Libro l : biblioteca
        ) {
            l.comprarLibro();
        }
    }


}
