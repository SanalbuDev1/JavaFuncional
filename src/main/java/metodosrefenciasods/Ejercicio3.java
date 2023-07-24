package metodosrefenciasods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<String> listaNumero = Arrays.asList("1","2","3","40","4","5","6","7","8","9","10");

        //getResult(listaNumero, (x) -> Integer.parseInt(x))..forEach(System.out::println); the same
        List<Integer> listaNumeros = getResult(listaNumero, Integer::parseInt);
        listaNumeros.sort((x,y) -> x.compareTo(y));
        listaNumeros.forEach(System.out::println);

        //getResult(listaNumero, (x) -> new Integer(x)).forEach(System.out::println);
        getResult(listaNumero, Integer::new);
        listaNumeros.sort(Integer::compareTo);
        listaNumeros.forEach(System.out::println);

    }

    public static List<Integer> getResult(List<String> datos, Function<String,Integer> func){
        List<Integer> result = new ArrayList<>();
        datos.forEach((x) -> {
            result.add(func.apply(x));
        });
        return result;
    }

}
