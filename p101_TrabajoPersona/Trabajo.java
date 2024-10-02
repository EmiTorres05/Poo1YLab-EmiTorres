package p101_TrabajoPersona;

public class Trabajo {
    private int Id;
    private double Salario;
    private String Rol;

    public Trabajo () {
    }
    public Trabajo (int id, double salario, String rol) {
        Id = id;
        Salario = salario;
        Rol = rol;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public String getRol() {
        return Rol;
    }
    public void setRol(String rol) {
        Rol = rol;
    }
    @Override
    public String toString() {
        return "Trabajo [Id=" + Id + " Rol=" + Rol + " Salario=" + Salario + "]";
    }
}
