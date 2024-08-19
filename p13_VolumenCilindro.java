//p13_VolumenCilindro - Calcular el volumen de un cilindro usando su radio y su altura

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
    
        double volumen, radio, altura ;
        
        System.out.print("Preparandose para calcular el volumen \n");
        System.out.print("Dame el radio: ");  radio = new Scanner(System.in).nextDouble();
        System.out.print("Dame la altura: ");  altura = new Scanner(System.in).nextDouble();
    
        volumen = Math.PI * altura * (radio * radio);
        
        System.out.println("El volumen del cilindro es: " + volumen);
    
        }
        
    
}
