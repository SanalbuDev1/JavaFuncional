package metodosReferenciados;

public class ProveedorComparaciones {

    // create a parameter public int comparPorNombre(Persona p1, Persona p2) in the class Persona and return int
    public int comparPorNombre(Persona p1, Persona p2){
        return p1.getNombre().compareTo(p2.getNombre());
    }

    // create a method compararPorEdad(Persona p1, Persona p2) in the class Persona and return int
    public int compararPorEdad(Persona p1, Persona p2){
        return p1.getEdad().compareTo(p2.getEdad());
    }

}
