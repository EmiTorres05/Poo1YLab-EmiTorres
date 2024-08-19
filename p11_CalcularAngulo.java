//p11_CalcularAngulo - Calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class p11_CalcularAngulo {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
    
        double angulo3, angulo1, angulo2 ;
        
        System.out.print("Preparandose para calcular el angulo \n");
        System.out.print("Dame la primer angulo: ");  angulo1 = new Scanner(System.in).nextDouble();
        System.out.print("Dame la segundo angulo: ");  angulo2 = new Scanner(System.in).nextDouble();

        angulo3 = 180 -( angulo1 + angulo2);

        System.out.println("El tercer angulo es: " + angulo3);

    }
}