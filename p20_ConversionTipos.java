//p20_ConversionTipos - Conversion entre tipos de datos en Java

public class p20_ConversionTipos {
    public static void main(String[] args) {

        int var1 = 9;
        double var2 = var1;
        float var3 = 123456.789f;
        double var4 = var3; 
        
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println(String.format("Implicita de int a double : %d %f",var1,var2));
        System.out.println(String.format("Implicita de float a double : %f %f",var3,var4));

        long var5 = 1234567890123456L;
        int var6 = (int) var5;
        int var7 = 21448364;
        short var8 = (short) var7;
        System.out.println(String.format("Manual con casting de long a int : %d %d",var5,var6));
        System.out.println(String.format("Manual con casting de int a short : %d %d",var7,var8));
    }
}