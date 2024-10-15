package p112_ControlVentas;

public class VentaCredito extends Venta {
    private double Meses;
    private double Interes;

    public VentaCredito(String articulo, int cantidad, double precio, double meses, double interes) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Interes = interes;
    }
        public double getTotalVenta() {
        Total = Total + (Meses * Interes);
        return Total;
    }
        @Override
        public String toString() {
            return "VentaCredito ["+ super.toString() + ", Meses =" + Meses + ", Interes =" + Interes + ", Total =" + getTotalVenta()
                    + "]";
        }
}
