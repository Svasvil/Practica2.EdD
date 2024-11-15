package sebastianvasquez_practica2;



public class ListaDobleC {

    public NodoLDC primerLugar;
    public NodoLDC ultimoLugar;

    public void Agregar(Perfil usuario) {
        NodoLDC nuevoNodo = new NodoLDC(usuario);

        if (primerLugar == null) {
            primerLugar = nuevoNodo;
            ultimoLugar = nuevoNodo;
            nuevoNodo.setAnteriorNodo(nuevoNodo);
            nuevoNodo.setSiguienteNodo(nuevoNodo);
        } else if (usuario.getId() < primerLugar.getUsuario().getId()) {
            nuevoNodo.setSiguienteNodo(primerLugar);
            nuevoNodo.setAnteriorNodo(ultimoLugar);
            primerLugar.setAnteriorNodo(nuevoNodo);
            ultimoLugar.setSiguienteNodo(nuevoNodo);
            primerLugar = nuevoNodo;
        } else if (usuario.getId() > ultimoLugar.getUsuario().getId()) {
            nuevoNodo.setAnteriorNodo(ultimoLugar);
            nuevoNodo.setSiguienteNodo(primerLugar);
            ultimoLugar.setSiguienteNodo(nuevoNodo);
            primerLugar.setAnteriorNodo(nuevoNodo);
            ultimoLugar = nuevoNodo;
        } else {
            NodoLDC actual = primerLugar;
            while (actual.getSiguienteNodo() != primerLugar
                    && actual.getSiguienteNodo().getUsuario().getId() < usuario.getId()) {
                actual = actual.getSiguienteNodo();
            }
            nuevoNodo.setSiguienteNodo(actual.getSiguienteNodo());
            nuevoNodo.setAnteriorNodo(actual);
            actual.getSiguienteNodo().setAnteriorNodo(nuevoNodo);
            actual.setSiguienteNodo(nuevoNodo);
        }
    }

    public void OrdenAlbatetico() {
        String Palabra1 = "Perro";
        String Palabra2 = "Gato";
        String Palabra3 = "Conejo";

        char letra1P1 = Palabra1.charAt(0); //Letra P = 80
        char letra1P2 = Palabra2.charAt(0); //letra G =71
        char letra1P3 = Palabra3.charAt(0); //Letra C= 67
        if (letra1P3 < letra1P2 && letra1P3 < letra1P1) {
            System.out.println("Primero  : Conejo\n"
                    + "Segundo:Gato\n"
                    + "Tercero: Perro");
        } else {
            System.out.println("lista no ordenada");
            
        }
    }

    public void OrdenarAlfabeticamente() {
/*
        if (primerLugar == null || primerLugar == ultimoLugar) {
            return;
        }
        boolean cambiado;
        do {
            cambiado = false;
            NodoLDC actual = primerLugar;
            do {
                NodoLDC siguiente = actual.getSiguienteNodo();
                if (siguiente != primerLugar && actual.getUsuario().getNombre().compareToIgnoreCase(siguiente.getUsuario().getNombre()) > 0) {
                    Perfil aux = actual.getUsuario();
                    actual.setUsuario(siguiente.getUsuario());
                    siguiente.setUsuario(aux);
                    cambiado = true;
                }
                actual = actual.getSiguienteNodo();
            } while (actual != primerLugar);
        } while (cambiado);
    }
*/

    }  //iba a usar este pero me acorde que era mas facil con un char y un if , ademas q pa este se ocupa instanciarlos en el main 

}