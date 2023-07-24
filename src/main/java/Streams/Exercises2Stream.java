package Streams;

import java.util.Arrays;
import java.util.List;

public class Exercises2Stream {

    public static void main(String[] args) {
        List<Integer> numerosPar  = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        int suma = numerosPar.stream()
                .filter( x -> x >= 10)
                .map(x -> {
                    System.out.println(x);
                    return x;
                })
                .reduce(0, Integer::sum);
        System.out.printf("Suma: %d%n", suma);

    }

}
