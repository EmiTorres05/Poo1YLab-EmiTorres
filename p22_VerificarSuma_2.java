//p22_VerificarSuma - verifica si la suma de un numero1 y un numero2 es igual a un numero 3

import java.util.Scanner;
public class p22_VerificarSuma_2 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Verificar si la suma de dos numeros es igual a un tercero\n");
        System.out.print("Dame el primer numero ? "); n1 = obj.nextInt();
        System.out.print("Dame el seguno numero ? "); n2 = obj.nextInt();
        System.out.print("Dame el tercer numero ? "); n3 = obj.nextInt();
        
        if( n1+n2 == n3 ){
        System.out.println("Son iguales");
        System.out.println(n1 + " + " + n2 + " = " + n3);
    }
        else{
        System.out.println("\nSon distintos");
        System.out.println("\nGracias por utilizar este programa");
        }
    }   
}