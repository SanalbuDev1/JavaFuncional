package metodosReferenciados;

import java.util.ArrayList;
import java.util.Collections;

public class Persona implements Comparable<Persona> {

    private Integer id;
    private Integer edad;
    private String nombre;

    public Persona(Integer id, Integer edad, String nombre) {
        super();
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o) {
        return this.getId().compareTo(o.getId());
    }

    public int compararPorEdad(Persona o) {
        return this.getEdad().compareTo(o.getEdad());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", edad='" + edad + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
