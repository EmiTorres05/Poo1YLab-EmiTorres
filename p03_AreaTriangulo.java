//p03 -  Calcular el area de un Triangulo

import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el area de un triangulo\n");
        System.out.print("Dame la base:");  base = obj.nextInt();
        System.out.print("Dame la altura:");  altura = obj.nextInt();
        
        area = ( base * altura )/ 2;

        System.out.println("Para un triangulo de base " + base + " y altura de " + altura + " tiene un area de " + area);
        System.out.println(String.format("Para un triangulo de base %d y altura de %d el area es %f", base, altura, area));
}
}
