// p57_TablasMultiplicar - Imprimir las tablas del 1 al 10 hasta el 10

import java.util.Scanner;

public class p57_TablasMultiplicar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,j, n, m;
        boolean repite = true;
        System.out.print("\033[H\033[2J"); System.out.flush();

        while (repite) {

        System.out.print("Hasta que tabla quieres  ? "); n = obj.nextInt();
        System.out.print("Hasta donde la quieres   ? "); m = obj.nextInt();

        for (i=1; i<=n; i++) {
        System.out.println("Tabla del " + i);
                for (j=1; j<=m; j++) {
                System.out.println(i + " x " + j + " = " + i*j);

            System.out.println();
                                }   
            }

            System.out.println("Desea continuar? (S/N)");
            String resp = obj.next().toUpperCase();
            repite = resp.equals("S");
            obj.close();
        }      
    } 
}