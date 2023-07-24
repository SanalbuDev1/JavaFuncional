package Streams;

import java.util.Arrays;
import java.util.List;

public class Exercises1Stream{

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int suma = numeros.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (x,y) -> x + y);


        // create a double value, use a doubleStream for sum numeros
        double suma2 = numeros.stream()
                .filter(x -> x % 2 == 0)
                .mapToDouble(x -> x)
                .sum();

    }

}

