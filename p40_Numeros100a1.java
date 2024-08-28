// p40_Numeros100a1 - imprimir numeros del 100 a n, con decrementos de d, usando while

import java.util.Scanner;

public class p40_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Imprimiendo los numeros de 100 a decrementos de d \n ");
        System.out.println("Desde donde deseas descender?    ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Decrementos de ?    ");
        int d = new Scanner(System.in).nextInt();


        while( c >= 1){
            System.out.println(c);
            c = c - d;
        }
        System.out.println("\nEl ciclo ha terminado...");
        System.out.println(c);
    }
    
}
