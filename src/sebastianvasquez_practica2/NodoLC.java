package sebastianvasquez_practica2;
public class NodoLC {
    private Compra dato;
    private NodoLC siguienteNodo;

    public NodoLC(Compra dato) {
        this.dato = dato;
    }

    public Compra getDato() {
        return dato;
    }

    public void setDato(Compra dato) {
        this.dato = dato;
    }
     public NodoLC getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoLC siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    @Override
    public String toString() {
        return "NodoLC{" + "dato=" + dato.toString() + '}';
    }
    
     
    
    
}
