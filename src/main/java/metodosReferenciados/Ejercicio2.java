package metodosReferenciados;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        ProveedorComparaciones proveedorComparaciones = new ProveedorComparaciones();
        List<Persona> listPersonas = Arrays.asList(
                new Persona(10,20,"Maria"),
                new Persona(22,25,"Ana"),
                new Persona(3,26,"Santi"),
                new Persona(4,31,"Max"),
                new Persona(5,32,"Maxi"),
                new Persona(6,33,"Maximiliano"),
                new Persona(7,20,"Maximiliano")
        );

        listPersonas.sort(proveedorComparaciones::comparPorNombre);
        listPersonas.forEach(System.out::println);
        listPersonas.sort(proveedorComparaciones::compararPorEdad);
        listPersonas.forEach(System.out::println);

        System.out.println("\n");
        listPersonas.sort(Persona::compararPorEdad);
        listPersonas.forEach(System.out::println);




    }

}
