package p94_Empleado01;

//Programa principal
public class App {
    public static void main(String[] args) {
        
    
    Empleado Empleado1 = new Empleado();//Instanciar
    Empleado Empleado2 = new Empleado();//Instanciar

    //Asignar valores a las propiedades
    Empleado1.Nombre = "Juan Perez";
    Empleado1.Edad = 45;

    Empleado2.Nombre = "Maria Lopez";
    Empleado2.Edad = 25;

    Empleado Empleado3;
    Empleado3 = new Empleado();//Instanciar
    //Asignar valores a las propiedades
    Empleado1.Nombre = "Jorge";
    Empleado1.Edad = 15;

    System.out.print("\033[H\033[2J");
    System.out.println("Empleado 1 nombre: " + Empleado1.Nombre);
    System.out.println("Empleado 1 edad: " + Empleado1.Edad);
    System.out.println(Empleado1.toString());//Invocar metodo tostring() del objeto
    System.out.println("Empleado 2 nombre: " + Empleado2.Nombre);
    System.out.println("Empleado 2 edad: " + Empleado2.Edad);
    System.out.println(Empleado2.toString());//Invocar metodo tostring() del objeto
    System.out.println("\nEmpleado3;");
    System.out.println(Empleado3.toString());//Invocar metodo tostring() del objeto
    }
}
