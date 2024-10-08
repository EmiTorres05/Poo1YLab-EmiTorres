//p24_PagaTrabajadorv2 - calcula la paga de un trabajador, las horas extra se pagan al doble

import java.util.Scanner;

public class p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        String nombre;
        int horas, extra=0;
        float paga, impuesto, tasa, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        tasa = 0.02f;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calculando la paga de un trabajador \n");
        System.out.print("Dame el nombre: "); nombre = obj.nextLine();
        System.out.print("Horas trabajadas: "); horas = obj.nextInt();
        System.out.print("Paga x hora: "); paga = obj.nextFloat();

        if (horas > 40){
            extra = horas - 40;
            pagabruta = 40 * paga + (extra * paga * 2);
        }else {
            pagabruta = horas * paga;
        }
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.printf("El trabajador %s trabajo %d horas a una paga de %.2f pesos, a una tasa de %.2f", nombre, horas, paga, tasa);
        System.out.println("Paga bruta =" + pagabruta);
        System.out.println("Impuesto =" + impuesto);
        System.out.println("Paga neta =" + paganeta);
    }
    
}
