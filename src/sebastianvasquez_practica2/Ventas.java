
package sebastianvasquez_practica2;
public class Ventas {
    private double monto;
    private int total;
    private double impuesto;

    public Ventas() {
    }

    public Ventas(double monto, int total, double impuesto) {
        this.monto = monto;
        this.total = total;
        this.impuesto = impuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ventas{" + "monto=" + monto + ", total=" + total + ", impuesto=" + impuesto + '}';
    }
    
    
}
