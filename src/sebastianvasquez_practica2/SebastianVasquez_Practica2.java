package sebastianvasquez_practica2;

public class SebastianVasquez_Practica2 {

    public static void main(String[] args) {

        //PrimerEjercicio 
        System.out.println("Primer Ejercicio");
        ListaS ls1 = new ListaS();
        ls1.AgregarLista(new Ventas( 0,2,0));
        ls1.AgregarLista(new Ventas(0,4,0));
        ls1.AgregarLista(new Ventas(0,1,0));
        ls1.AgregarLista(new Ventas(0,6,0));
       
        ls1.MostrarInformacion();
        System.out.println("\n");

        //Segundo Ejericio 
        System.out.println("Segundo Ejercicio");
        ListaLC lista1 = new ListaLC();
        lista1.agregar(new Compra(0, true, 0));
        lista1.agregar(new Compra(0, false, 0));
        lista1.agregar(new Compra(0, false, 0));
        lista1.agregar(new Compra(0, true, 0));
        System.out.println("Lista sin ordenar: ");
        System.out.println(lista1.toString());
        System.out.println("Lista ordenadas:");
        lista1.ordenarExentos();
        System.out.println(lista1.toString());
        System.out.println("\n");

        //Tercer Ejercicio
        
        System.out.println("Tercer Ejercicio");
        System.out.println("lista ordenada");
        ListaDobleC lista = new ListaDobleC();
        lista.OrdenAlbatetico();
        
        /*
        lista.Agregar(new Perfil("A", "Aarlos", 1));
        lista.Agregar(new Perfil("C", "Carlos", 3));
        lista.Agregar(new Perfil("B", "Barlos", 2));
        lista.Agregar(new Perfil("D", "Darlos", 4));
        System.out.println("Lista ordenada ");
        lista.OrdenarAlfabeticamente();
        System.out.println(lista.toString());
*/

    }

}
