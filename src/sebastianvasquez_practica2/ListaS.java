package sebastianvasquez_practica2;

public class ListaS {

    public NodoS primero;

    public void AgregarLista(Ventas productos) {
        NodoS nodo1 = new NodoS(new DatoS(productos));
        if (primero == null) {
            this.primero = nodo1;
        } else {
            NodoS aux = this.primero;
            while (aux.getSiguientePosicion() != null) {
                aux = aux.getSiguientePosicion();
            }
            aux.setSiguientePosicion(nodo1);
        }
    }

    public void MostrarInformacion() {
        if (primero == null) {
            System.out.println("Lista Vacia");
            return;
        }
        NodoS aux = this.primero;
        Ventas TotalMayor = aux.getProducto().getArticulo1();
        while (aux != null) {
            if (aux.getProducto().getArticulo1().getTotal() > TotalMayor.getTotal()) {
                TotalMayor = aux.getProducto().getArticulo1();
               
            }
            aux = aux.getSiguientePosicion();
        }
        System.out.println("El mayor es  :"+TotalMayor.toString());
    }
}