package operacionesReduccion;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercises1 {

    // arreglo de numeros de 1 a 20 de tipo Integer
    private static Integer[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,
        15,16,17,18,19,20};

    public static void main(String[] args) {

        // utiliza java.util.stream.* para realizar la suma del parametro numbers
        // y lo almacena en la variable sum
        Integer sum = Stream.of(numbers)
                .reduce(0, Integer::sum);
        System.out.println("Suma: " + sum);

        int[] suma = Stream.of(numbers)
                        .mapToInt(Integer::intValue)
                        .toArray();
        // suma
        IntStream.of(suma)
                .reduce(0, (x, y) -> x + y);

        //average
        IntStream.of(suma)
                .average()
                .ifPresent(System.out::println);

        // get min and max
        IntStream.of(suma)
                .min()
                .ifPresent(System.out::println);

        IntStream.of(suma)
                .max()
                .ifPresent(System.out::println);

        // count
        System.out.println(IntStream.of(suma).count());



    }

}
