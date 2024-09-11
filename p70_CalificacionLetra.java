//p70_CalificacionLetra - Regresa una letra en base al promedio

import java.util.Scanner;
public class p70_CalificacionLetra {
    public static char CalifLetra(float prom) {
        char letra=' ';
        if(prom>=90&&prom<=100)
        letra='A';
        else if(prom>=80&&prom<90)
        letra='B';
        else if(prom>=70&&prom<80)
        letra='C';
        else if(prom>=60&&prom<70)
        letra='D';
        else if(prom>=0&&prom<60)
        letra='F';
        return letra;}
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        int prom;

        System.out.println("Ingresa la calificacion"); prom = obj.nextInt();
        System.out.println("Tu calificacion con letra es "+ CalifLetra(prom));
        
    }
    
}
