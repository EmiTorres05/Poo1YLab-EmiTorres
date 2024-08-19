// p12_ConvertirTemperatura convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double celsius, fahrenheit ;

        System.out.print("Preparandose para convertir a grados celsius \n");
        System.out.print("Dame la temperatura en grados fahrenheit: ");  fahrenheit = new Scanner(System.in).nextDouble();

        celsius = ((fahrenheit - 32) * (5.0/9.0));

        System.out.println("La temperatura en grados celsius es de: " + celsius);
        
    }
    
}
