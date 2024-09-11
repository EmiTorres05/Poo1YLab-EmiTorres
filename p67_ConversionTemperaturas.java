//p67_ConversionTemperaturas - Convierte de grados celsius a fahrenheit y viceversa usando funciones

import java.util.Scanner;
public class p67_ConversionTemperaturas {
    public static float CaF(float t) {
        return (t*9/5)+32;}
        public static float FaC(float t) {
        return (t-32)*5/9;}
    public static void main(String[] args) {    
        int op;
        float temp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        do{
        System.out.println("Conversion de temperatura");
        System.out.println("1. C a F\n2. F a C\n3. Salir");
        System.out.println("Elige : "); op = obj.nextInt();

        switch (op){
            case 1:
                System.out.println("Converti de C a F");
                System.out.println("Dame la temperatura"); temp = obj.nextFloat();
                System.out.println("El resultado es: " + CaF(temp));
                break;
            case 2:
                System.out.println("Converti de f a A");
                System.out.println("Dame la temperatura"); temp = obj.nextFloat();
                System.out.println("El resultado es: " + FaC(temp));
                break;
            case 3:
                System.out.println("Gracias por usar este programa");
                break;
            default: break;
        }
        System.out.println("Presiona cualquier tecla para continuar");obj.nextLine();obj.nextLine();
        } while (op<3);
        System.out.println("\nPrograma terminado");
    }
    
}
