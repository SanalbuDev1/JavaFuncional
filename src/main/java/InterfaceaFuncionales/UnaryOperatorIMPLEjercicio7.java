package InterfaceaFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorIMPLEjercicio7 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10,20,30,40,50);
        List<Integer> listaActualizada = operatorUnary(lista, (x) -> x * x);
        listaActualizada.forEach( (x) -> System.out.printf("El producto de los numeros es %d %n", x) );
    }

    public static List<Integer> operatorUnary(List<Integer> lista, UnaryOperator<Integer> func){

        List<Integer> listaTemporal = new ArrayList<>();
        lista.forEach((x) -> {
            listaTemporal.add(func.apply(x));
        });

        return listaTemporal;

    }

}
