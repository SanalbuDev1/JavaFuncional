package InterfaceaFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorIMPLEjercicio7 {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (x,y) -> x * y;
        BinaryOperator<Integer> binaryOperator2 = (x,y) -> x - y;
        Integer multiplicacion = binaryOperator.apply(10,20);
        System.out.println(multiplicacion);

        BinaryOperator<Integer> min = BinaryOperator.minBy((Integer x1, Integer x2)-> x1.compareTo(x2));
        BinaryOperator<Integer> max = BinaryOperator.maxBy((Integer x1, Integer x2) -> x1.compareTo(x2));

        multiplicacion = min.apply(10,20);
        System.out.println(multiplicacion);

        multiplicacion = max.apply(10,20);
        System.out.println(multiplicacion);



    }



}
