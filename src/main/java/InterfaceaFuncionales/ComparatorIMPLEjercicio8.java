package InterfaceaFuncionales;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorIMPLEjercicio8 {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Santago","Ana","Kelly","Juan");
        nombres.forEach((x) -> System.out.printf("Antes de ordenarse %s %n",x));
        Collections.sort(nombres);
        nombres.forEach((x) -> System.out.printf("Antes de ordenarse %s %n",x));

        // Persona

        List<Persona> persona = Arrays.asList(new Persona("Santiago"),
                new Persona("Ana"),
                new Persona("Kelly"),
                new Persona("Juan"));

        Collections.sort(persona);

        nombres.forEach((x) -> System.out.printf("despues de ordenarse %s %n",x));

        List<Integer> ids = Arrays.asList(10,20,30,24,100,10);
        Comparator<Integer> listaIds  = (x1,x2) -> x1-x2;
        Collections.sort(ids,listaIds);

        ids.forEach((x) -> System.out.println(x));

    }

}
