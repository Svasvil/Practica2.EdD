package sebastianvasquez_practica2;
public class NodoLDC {
    private Perfil usuario;
    private NodoLDC siguienteNodo;
     private NodoLDC anteriorNodo;

    public NodoLDC(Perfil usuario) {
        this.usuario = usuario;
    }

    public Perfil getUsuario() {
        return usuario;
    }

    public void setUsuario(Perfil usuario) {
        this.usuario = usuario;
    }

    public NodoLDC getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoLDC siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public NodoLDC getAnteriorNodo() {
        return anteriorNodo;
    }

    public void setAnteriorNodo(NodoLDC anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }

    @Override
    public String toString() {
        return "NodoLDC{" + "usuario=" + usuario.toString() + '}';
    }
    
     
            
    
}
