//p72_SumaDigitos - Suma los digitos individuales de un numero entero

import java.util.Scanner;

public class p72_SumaDigitos {
    public static int SumaDigitos(long n){
        long suma=0;
        while( n != 0){
            long digito = n % 10;
            suma+=digito;
            n = n / 10;
        }

        return (int) suma;
    }
    public static void main(String[] args) {
        long numero;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un numero entero y sumare sus digitos:  ");
        numero = new Scanner(System.in).nextLong();
        System.out.println("\nSuma digitos "+ SumaDigitos(numero) );
        
    }
    
}
