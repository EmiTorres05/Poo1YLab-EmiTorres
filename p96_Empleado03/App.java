package p96_Empleado03;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Perez", 25);//Instanciar
        Empleado empleado2 = new Empleado("Nepomuseno", 1);//Instanciar
        Empleado empleado3 = new Empleado();

        empleado3.setNombre("Jorge");
        empleado3.setEdad(2);
    
        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1: "+ empleado1.toString());
        System.out.println("Empleado 2: "+ empleado2.toString()); 
        System.out.println("Empleado 3: "+ empleado3.toString()); 

        empleado2.setNombre("Anastacia");
        empleado2.setEdad(15);
        System.out.println("\nEmpleado 2 despues de la transformacion: " + empleado2.toString());
    }

}