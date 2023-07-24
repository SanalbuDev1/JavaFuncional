package operacionesReduccion;

import java.util.Arrays;
import java.util.List;

// create the class Empleado with the next attributes
// id -> long, nombre -> String, ingresos -> double, genero -> Genero, edad -> int
// create the enum Genero with the next values HOMBRE, MUJER
// create the constructor with all the attributes
// create the getters and setters
// create the toString method
public class Empleado {

    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    public Empleado(long id, String nombre, double ingresos, Genero genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public Empleado() {
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", ingresos=" + ingresos + ", genero=" + genero + ", edad=" + edad + '}';
    }

    public static List<Empleado> getEmpleados(){
        return Arrays.asList(new Empleado(1, "Santiago",1333, Genero.HOMBRE,20),
                new Empleado(2, "Maria",1333, Genero.MUJER,22),
                new Empleado(3, "Ana",200, Genero.MUJER,24),
                new Empleado(4, "Max",13333, Genero.HOMBRE,27),
                new Empleado(5, "Maxi",2333, Genero.HOMBRE,32),
                new Empleado(6, "Aximiliano",533, Genero.HOMBRE,42),
                new Empleado(7, "Maximiliano",7333, Genero.HOMBRE,50));
    }


    public enum Genero {
        HOMBRE, MUJER
    }

}