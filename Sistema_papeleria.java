//p64_SumaTerminos1 - imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma
//Alumno: Said Emiliano Torres Esparza 3.-C

import java.util.Scanner;

public class Sistema_papeleria {
    public static void main(String[] args) {
        //Entrada
        int CantCopias, NumVenta, C, O, D, Ct, Ot, Dt, Total, Suma;
        NumVenta=Ct=Ot=Dt=0;
        char Tipo;
        Scanner obj = new Scanner(System.in);

        //Proceso 
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("============================================\nPapelería la Malena, SA. de CV.\nSistema de ventas de copias\n============================================");

        boolean repite=true;
        while (repite) {
            NumVenta++;
            System.out.println("\nVenta " + NumVenta);
            System.out.print("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6? ");
            Tipo = Character.toUpperCase( obj.next().charAt(0) );
            switch (Tipo) {
                case 'C': System.out.print("¿ Cantidad ? ");
                C = new Scanner(System.in).nextInt();
                Ct=Ct+C;    break;
                case 'O': System.out.print("¿ Cantidad ? ");
                O = new Scanner(System.in).nextInt();
                Ot=Ot+O;    ;   break;   
                case 'D': System.out.print("¿ Cantidad ? ");
                D = new Scanner(System.in).nextInt();
                Dt=Dt+D;    ;   break;
                default: break;}

                System.out.println("Otra venta (s/n) ?:");
                String resp = obj.next().toLowerCase();
                repite = resp.equals("s"); 
        }
        //Salida
        Total = Ct + Ot + Dt;
        Suma = (Ct*3) + (Ot*4) + (Dt*6);
        System.out.println("============================================\nResumen diario de ventas\n============================================");

        System.out.println("Num de ventas realizadas: "+ NumVenta + "\n========================");
        System.out.printf("Carta       : %d  - $ %d\n", Ct, Ct * 3);
        System.out.printf("Oficio      : %d  - $ %d\n", Ot, Ot * 4);
        System.out.printf("Doble of.   : %d  - $ %d\n", Dt, Dt *6);
    System.out.printf("========================\nTot. Ventas : %d  - $ %d \n", Total, Suma);

        if (Suma < 50){ 
            System.out.println("Venta moderada");
        }
        else if (Suma >= 50 && Suma <101) {
            System.out.println("Venta Frecuente");
        }
        else if (Suma > 101) {
            System.out.println("Venta Superada");
        }
    }
}
