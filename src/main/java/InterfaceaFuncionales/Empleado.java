package InterfaceaFuncionales;

public class Empleado {

    String nombre;
    Double salario;
    Integer edad;
    String departamento;


    public Empleado(String nombre, Double salario, Integer edad, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.departamento = departamento;
    }

    public Empleado(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", edad=" + edad +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
