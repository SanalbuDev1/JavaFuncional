package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise3StreamWithValues {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("java funcional");
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("java ", "funcional ","Interesante");
        stream2.forEach(System.out::print);

        String[] nombreLenguajesProgramacion = {"java", "python", "c++", "c#", "php", "javascript", "ruby", "go", "kotlin", "swift"};
        Stream<String> stream3 = Stream.of(nombreLenguajesProgramacion);
        stream3.forEach(System.out::println);

        Stream<Estudiante> streamEstudiantes = Stream.<Estudiante>builder()
                .add(new Estudiante( "Juan", 10, 20d))
                .add(new Estudiante("Maria", 20, 21d))
                .add(new Estudiante("Pedro", 22, 22d))
                .add(new Estudiante("Luis", 25, 23d))
                .build();
        streamEstudiantes.forEach(System.out::println);

        IntStream unoAVeinte = IntStream.range(1, 21);
        unoAVeinte.forEach(System.out::println);
    }

}
