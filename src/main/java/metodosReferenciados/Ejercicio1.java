package metodosReferenciados;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {

    static List<Persona> listaPersonas;

    static {
        listaPersonas = Arrays.asList(
                new Persona(10,20,"Maria"),
                new Persona(22,25,"Ana"),
                new Persona(3,26,"Santi"),
                new Persona(4,30,"Max")
        );
    }

    public static void main(String[] args) {

        // utiliza la implemtacion comparable en la clase
        Collections.sort(listaPersonas);
        System.out.println("Ordenar por ID");
        listaPersonas.forEach((x) -> System.out.println(x + "\n"));
        Collections.sort(listaPersonas, (x,y) -> x.getEdad().compareTo(y.getEdad()));
        System.out.println("Ordenar por edad");
        listaPersonas.forEach((x) -> System.out.println(x + "\n"));
        Collections.reverse(listaPersonas);
        System.out.println("Ordenar por edad revertido");
        listaPersonas.forEach((x) -> System.out.println(x + "\n"));

        //metodos referenciado
        System.out.println("Ordenar por id");
        Collections.sort(listaPersonas, Persona::compareTo);
        listaPersonas.forEach(System.out::println);
        System.out.println("Ordenar por edad");
        Collections.sort(listaPersonas, Persona::compararPorEdad);
        listaPersonas.forEach(System.out::println);
    }

}
