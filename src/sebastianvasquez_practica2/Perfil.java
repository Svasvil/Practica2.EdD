
package sebastianvasquez_practica2;
public class Perfil {
    private String nombre;
    private String apellido;
    private int id;
    

    public Perfil() {
    }

    public Perfil(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Perfil{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + '}';
    }

    


    
    
    
    
}
