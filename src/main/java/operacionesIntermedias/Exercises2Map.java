package operacionesIntermedias;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercises2Map {

    public static void main(String[] args) {

        // sumele 10 a los numeros que entran
        IntStream intDesde1Hasta10 = IntStream.rangeClosed(1, 10);
        intDesde1Hasta10.map((x) -> x + 10)
                .forEach(System.out::println);

        // use the indDesde1Hasta10 again, now multiply by 10
        System.out.println("\n");
        intDesde1Hasta10 = IntStream.rangeClosed(1, 10);

        intDesde1Hasta10.map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * 10;
            }
        }).forEach(System.out::println);

        // promedio del personal femenino

        List<Empleado> listEmpleado = Arrays.asList(new Empleado(1, "Santiago",1333, Empleado.Genero.HOMBRE,20),
                new Empleado(2, "Maria",1333, Empleado.Genero.MUJER,22),
                new Empleado(3, "Ana",200, Empleado.Genero.MUJER,24),
                new Empleado(4, "Max",13333, Empleado.Genero.HOMBRE,27),
                new Empleado(5, "Maxi",2333, Empleado.Genero.HOMBRE,32),
                new Empleado(6, "Aximiliano",533, Empleado.Genero.HOMBRE,42),
                new Empleado(7, "Maximiliano",7333, Empleado.Genero.HOMBRE,50));

        System.out.println("Promedio de las mujeres");
        double suma = listEmpleado.stream().filter(x -> x.getGenero().equals(Empleado.Genero.HOMBRE))
                .mapToDouble(x -> x.getIngresos())
                .sum();

        double promedio = suma / listEmpleado.stream()
                .filter(x -> x.getGenero().equals(Empleado.Genero.HOMBRE)).count();

        double promedio2 = listEmpleado.stream()
                .filter(x -> x.getGenero().equals(Empleado.Genero.HOMBRE))
                .mapToDouble(x -> x.getIngresos())
                .average()
                .getAsDouble();

        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " + promedio);
        System.out.println("El promedio es " + promedio2);

        // utiliza el metodo filtrarEdadOrdenarNombre
        System.out.println("\n");
        filtrarEdadOrdenarNombre(listEmpleado).forEach(System.out::println);



    }

    // crea un metodo que reciba una lista de Empleado y devuelva un Stream de Empleado
    // que filtre por los empleados >= 30 años y que devuelva un stream de Empleado
    // que solo tenga los nombres
    public static Stream<String> filtrarEdad(List<Empleado> listaEmpleados) {
        return listaEmpleados.stream()
                .filter(x -> x.getEdad() >= 30)
                .map(x -> x.getNombre());
    }

    // crea un metodo que reciba una lista de Empleado y devuelva un Stream de Empleado
    // que filtre por los empleados >= 30 años y que devuelva un stream de Empleado
    // tambien que ordene por nombre
    public static Stream<Empleado> filtrarEdadOrdenarNombre(List<Empleado> listaEmpleados) {
        return listaEmpleados.stream()
                .filter(x -> x.getEdad() >= 5)
                .sorted(Comparator.comparing(Empleado::getNombre));
    }







}
