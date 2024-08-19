//p10_HipotenusaTriangulo - Calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
    System.out.print("\033[H\033[2J"); System.out.flush();

    double hipotenusa ;
    int lado1, lado2;
    
    System.out.print("Preparandose para calcular la hipotenusa \n");
    System.out.print("Dame la primer longitud: ");  lado1 = new Scanner(System.in).nextInt();
    System.out.print("Dame la segunda longitud: ");  lado2 = new Scanner(System.in).nextInt();

    hipotenusa = Math.sqrt( (lado1 * lado1) + (lado2 * lado2) );
    
    System.out.println("Si la primera longitud es: " + lado1);
    System.out.println("Y la segunda longitud es: " + lado2);
    System.out.println("Entonces la hipotenusa del triangulo es: " + hipotenusa);

    }
    
}
