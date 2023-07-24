package optional;

// create atributos for the class Employee
// email -> String, name -> String, lastname -> String, age -> int, rol -> double
// create contructor with all the atributos
// create constructor empty
// create getters and setters
// create toString method
public class Employee {

    private String email;
    private String name;
    private String lastname;
    private int age;
    private String rol;

    public Employee(String email, String name, String lastname, int age, String rol) {
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.rol = rol;
    }

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getRol() {
        return rol;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int edad) {
        this.age = edad;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Employee{" + "email=" + email + ", name=" + name + ", lastname=" + lastname + ", age=" + age + ", rol=" + rol + '}';
    }

}

