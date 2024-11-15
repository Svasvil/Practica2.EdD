package sebastianvasquez_practica2;
public class NodoS {
    private NodoS siguientePosicion;
    private DatoS producto;

    public NodoS(NodoS siguientePosicion) {
        this.siguientePosicion = siguientePosicion;
    }

    public NodoS(DatoS producto) {
        this.producto = producto;
    }

       public NodoS getSiguientePosicion() {
        return siguientePosicion;
    }

    public void setSiguientePosicion(NodoS siguientePosicion) {
        this.siguientePosicion = siguientePosicion;
    }

    public DatoS getProducto() {
        return producto;
    }

    public void setProducto(DatoS producto) {
        this.producto = producto;
    }   
}
