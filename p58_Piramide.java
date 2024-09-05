// p58_Piramide - Imprime una piramide con el caracter deseado

import java.util.Scanner;

public class p58_Piramide {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int i,j,r;
        char c;
        Scanner obj = new Scanner(System.in);

        System.out.print("De cuantos renglones? "); r = obj.nextInt();
        System.out.print("De que caracter? "); c = obj.next().charAt(0);

        for(i = 1; i<=r; i++) {

            for(j = 1; j <=i; j++)
                System.out.print(c);

            System.out.println();

        }
        obj.close();
    }
    
}