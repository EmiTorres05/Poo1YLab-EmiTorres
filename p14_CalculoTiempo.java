//p14_CalculoTiempo - Dada una cantidad en horas calcular su equivalente en dias, miutos y segundos

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
    
        double horas ,dias, minutos, segundos;

        System.out.print("Preparandose para calcular los equivalentes \n");
        System.out.print("Dame las horas: "); horas = new Scanner(System.in).nextDouble();
        
        dias = horas/24;
        minutos = horas * 60;
        segundos = horas * 360;

        System.out.println(String.format("Equivalen a: %.2f dias, %.2f minutos, y %.2f segundos",dias, minutos, segundos));
        
    }
}
