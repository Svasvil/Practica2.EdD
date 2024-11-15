package sebastianvasquez_practica2;
public class Compra {
    private double monto;
    private boolean exento;
    private double impuesto;
    
    public Compra(double monto, boolean exento, double impuesto) {
        this.monto = monto;
        this.exento = exento;
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

    public boolean isExento() {
        return exento;
    }

    public void setExento(boolean exento) {
        this.exento = exento;
    }

    @Override
    public String toString() {
        return "Compra{" + "monto=" + monto + ", exento=" + exento + ", impuesto=" + impuesto + '}';
    }
    
    
}
