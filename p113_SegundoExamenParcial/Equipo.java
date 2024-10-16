package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, String liga) {
        Jugadores = new ArrayList<>();
        Nombre = nombre;
        Liga = liga;
    }
    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }
    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
    public double getBono(){
        double bono=0;
        for (Jugador jugador : Jugadores) {
            bono = bono + jugador.getBono();
        }
        return bono;
    }
    public double getTotal(){
        double total=0;
        for (Jugador jugador : Jugadores) {
            total = total + jugador.Total;
        }
        return total;
    }
    public int getTotalH(){
        int totalH=0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'H')
            totalH = totalH + 1;
        }
        return totalH;
    }
    public int getTotalM(){
        int totalM=0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'M')
            totalM = totalM + 1;
        }
        return totalM;
    }
    public void reporte(){
        System.out.println(this);
        for (Jugador jugador : Jugadores){
            System.out.println("> " + jugador + "\n");}
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores =" + Jugadores.size() + ", Bono="
                + getBono() + ", Total =" + getTotal() + ", Hombres =" + getTotalH() + ", Mujeres ="
                + getTotalM() + "]";
    }
}
