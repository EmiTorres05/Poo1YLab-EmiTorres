package p116_Juego;

public class App {
    public static void main(String[] args) {
        
        JuegoDados misDados = new JuegoDados();

        System.out.print("\033[H\033[2J");
        misDados.iniciar();
        misDados.jugar();
        misDados.finalizar();

        JuegoAdivina miAdivina = new JuegoAdivina();
        miAdivina.iniciar();
        miAdivina.jugar();
        miAdivina.finalizar();
    }
}
