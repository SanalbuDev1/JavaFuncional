package operacionesIntermedias;

import java.util.Arrays;
import java.util.List;

public class Exercises1Filter {

    public static void main(String[] args) {

        List<Empleado> listEmpleado = Arrays.asList(new Empleado(1, "Santiago",1333, Empleado.Genero.HOMBRE,20),
                new Empleado(2, "Maria",1333, Empleado.Genero.MUJER,22),
                new Empleado(3, "Ana",200, Empleado.Genero.MUJER,24),
                new Empleado(4, "Max",13333, Empleado.Genero.HOMBRE,27),
                new Empleado(5, "Maxi",2333, Empleado.Genero.HOMBRE,32),
                new Empleado(6, "Aximiliano",533, Empleado.Genero.HOMBRE,42),
                new Empleado(7, "Maximiliano",7333, Empleado.Genero.HOMBRE,50));

        // create a filter for listEmpleado only for Genero.hombre
        System.out.println("\n Genero Hombre");
        listEmpleado.stream()
                .filter((x) -> x.getGenero().equals(Empleado.Genero.HOMBRE))
                .forEach(System.out::println);

        System.out.println("\n Genero Mujer");
        listEmpleado.stream()
                .filter((x) -> x.getGenero().equals(Empleado.Genero.MUJER))
                .forEach(System.out::println);

        System.out.println("\n Edad mayor a 30, gane mas de 1000 y sea hombre");
        listEmpleado.stream()
                .filter((x) -> x.getEdad() > 30)
                .filter((x) -> x.getGenero().equals(Empleado.Genero.HOMBRE))
                .filter((x)-> x.getIngresos() >= 1001)
                .forEach(System.out::println);

        System.out.println("\n Hombre y que contenga la A en su nombre");
        listEmpleado.stream()
                .filter((x) -> x.getGenero().equals(Empleado.Genero.HOMBRE))
                .filter((x) -> x.getNombre().toUpperCase().startsWith("a"))
                .forEach(System.out::println);
    }

}
