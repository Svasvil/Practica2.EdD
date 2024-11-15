package sebastianvasquez_practica2;

public class ListaLC {

     private NodoLC primerLugar;
    private NodoLC ultimoLugar;


    public void agregar(Compra compra) {
        NodoLC nuevoNodo = new NodoLC(compra);
        if (primerLugar == null) {
            primerLugar = nuevoNodo;
            ultimoLugar = nuevoNodo;
            nuevoNodo.setSiguienteNodo(primerLugar);
        } else {
            this.ultimoLugar.setSiguienteNodo(nuevoNodo);
            this.ultimoLugar = nuevoNodo;
            this.ultimoLugar.setSiguienteNodo(this.primerLugar);
        }
    }

   
    public void ordenarExentos() {
        if (primerLugar == null) {
            return;         }

        int cantVerdadero = 0;
        int cantFalsos = 0;

    
        NodoLC actual = primerLugar;
        do {
            if (actual.getDato().isExento()) { 
                cantVerdadero++;
            } else {
                cantFalsos++;
            }
            actual = actual.getSiguienteNodo();
        } while (actual != primerLugar);


        actual = primerLugar;
        while (cantVerdadero > 0) {
            actual.getDato().setExento(true); 
            actual = actual.getSiguienteNodo();
            cantVerdadero--;
        }
        while (cantFalsos > 0) {
            actual.getDato().setExento(false); 
            actual = actual.getSiguienteNodo();
            cantFalsos--;
        }
    }

    @Override
    public String toString() {
        if (this.primerLugar != null) {
            NodoLC aux = primerLugar;
            String cadena = "";
            do {
                cadena += aux.getDato().toString() + " ";
                aux = aux.getSiguienteNodo();
            } while (aux != primerLugar);
            return cadena.trim();
        }
        return "Lista vacía";
    }
}
