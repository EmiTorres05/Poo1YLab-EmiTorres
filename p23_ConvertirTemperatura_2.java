//p23_ConvertirTemperatura (2) - civierte de grados centigrados a farenheit y viceversa

import java.util.Scanner;

public class p23_ConvertirTemperatura_2 {
    public static void main(String[] args) {
        float temp, res;
        int op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Convertir de grados celcius a farenheit y viceversa\n");
        System.out.println("[1] Farenheit a Centigrados");
        System.out.println("[2] Centigrados a Farenheit ");
        System.out.print("Elije una opcion ? "); op = obj.nextInt();
        
        if(op == 1){
            System.out.println("Convirtiendo de grados Farenheit a grados celsius");
            System.out.print("Dame los grados Farenheit ? "); temp = obj.nextFloat();
            res = ( temp - 32 ) * 5 / 9;
            System.out.printf("%.2f Farenheit, equivale a %.2f grados Centigrados", temp, res);
        }
        else if(op == 2){
            System.out.println("Convirtiendo de grados celsius a grados farenheit");
            System.out.println("\nConvertir de Centigrados a Farenheit\n");
            System.out.print("Dame los grados Centigrados ? "); temp = obj.nextFloat();
            res = ( temp * 9 / 5 ) + 32;
            System.out.printf("%.2f Centigrados, equivale a %.2f grados Farenheit", temp, res);
        }
        else{
            System.out.println("\nOpcion invalida");
        }
        System.out.println("\nGracias por utilizar este programa");

    }
    
}
