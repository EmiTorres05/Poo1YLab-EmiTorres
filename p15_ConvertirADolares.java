//p15_ConvertirADolares - Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
    
        double pesos, dolares, equivalente;

        System.out.print("Preparandose para calcular el equivalente \n");
        System.out.print("Dame la cantidad de pesos: "); pesos = new Scanner(System.in).nextDouble();

        dolares = 18.77;

        equivalente = pesos/dolares;

        System.out.println(String.format("%.2f pesos equivalen a %.2f dolares",pesos, equivalente));

    }
}
