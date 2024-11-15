package sebastianvasquez_practica2;
public class DatoS {
    private Ventas  articulo1;

    public DatoS(Ventas articulo1) {
        this.articulo1 = articulo1;
    }

    public Ventas getArticulo1() {
        return articulo1;
    }

    public void setArticulo1(Ventas articulo1) {
        this.articulo1 = articulo1;
    }

    @Override
    public String toString() {
        return "DatoS{" + "articulo1=" + articulo1 + '}';
    }
      
    }
