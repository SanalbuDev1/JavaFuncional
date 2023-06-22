package InterfaceaFuncionales;

public class Persona implements Comparable<Persona> {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
