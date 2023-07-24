package Streams;

// create class with name Estudiante
// generate getters and setter of next attributes: nombre, edad, calificacion
// generate a constructor with next parameters: nombre, edad, calificacion
// generate a constructor empty.
// create you the next code
public class Estudiante {

    private String nombre;
    private Integer edad;
    private Double calificacion;

    public Estudiante(String nombre, Integer edad, Double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", calificacion=" + calificacion +
                '}';
    }
}