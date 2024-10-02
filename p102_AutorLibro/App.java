package p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro Libro1 = new Libro();
        Autor autor = new Autor();
        Libro1.setIsbn("1234567-27-32");
        Libro1.setNombre("Java para principiantes");
        Libro1.setPrecio(300);
        autor.setNombre("Carlos Castañeda");
        autor.setEdad(45);
        autor.setCorreo("castr@uaz.edu.mx");

        System.out.print("\033[H\033[2J");
        System.out.println("Datos del Libro 1");
        System.out.println("Isbn        :" + Libro1.getIsbn());
        System.out.println("Nombre      :" + Libro1.getNombre());
        System.out.println("Precio      :" + Libro1.getPrecio());
        System.out.println("Autor: "+ Libro1.getAutor().getNombre());
        System.out.println("Edad: "+ Libro1.getAutor().getEdad());
        System.out.println("Correo: " + Libro1.getAutor().getCorreo());
        System.out.println("\n "+ Libro1.toString());
        
        Libro libro2 = new Libro("4567-89-10-11", "Seguridad en Redes", 450,new Autor("William Perez", "perez@gmail.com", 50));
        System.out.println("\nDatos del libro 2");
        System.out.println("Isbn: "+libro2.getIsbn());
        System.out.println("Nombre: "+ libro2.getNombre());
        System.out.println("Precio: "+libro2.getPrecio());
        System.out.println("Autor: "+ libro2.getAutor().getNombre());
        System.out.println("Edad: "+ libro2.getAutor().getEdad());
        System.out.println("Correo: " + libro2.getAutor().getCorreo());
        System.out.println("\n "+ libro2.toString());
    }     
}
      
