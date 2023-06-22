package InterfaceaFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateIMPLEjercicio4 {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer>  evaluar1 = (x,y) -> x < y;
        BiPredicate<Integer, Integer>  evaluar2 = (x,y) -> x < 100 && y < 100;
        System.out.println(evaluar1.test(10,20));
        System.out.println(evaluar1.and((evaluar2)).test(100,200)); // evalua las dos condiciones AND
        System.out.println(evaluar1.or((evaluar2)).test(100,200)); // evalua las dos condiciones OR
        System.out.println(evaluar1.negate().test(10,20));

        /**
         * Se quiere obtener un reprote de todos los empleados que cumplan las siguentes condciones
         * 1. 25 años e adelante y que sea del departamento caldas
         */

        List<Empleado> empleados = Arrays.asList(
                new Empleado("Ana",3000d, 25, Departamentos.CALDAS.getCiudad()),
                new Empleado("Ana maria",4000d,30, Departamentos.ANTIQUITA.getCiudad()),
                new Empleado("Santiago",5000d, 28, Departamentos.CALDAS.getCiudad()),
                new Empleado("Kelly",6000d, 41, Departamentos.CALDAS.getCiudad()),
                new Empleado("Ana2",3000d, 26, Departamentos.CALDAS.getCiudad()),
                new Empleado("Ana maria2",4000d,30, Departamentos.ANTIQUITA.getCiudad()),
                new Empleado("Santiago2",5000d, 25, Departamentos.CALDAS.getCiudad()),
                new Empleado("Kelly3",6000d, 20, Departamentos.CALDAS.getCiudad())
        );

        List<Empleado> empleados2 = listaEmpleados(empleados, (x,y) -> x > 25 && y.toUpperCase().equals("CALDAS"));
        for(Empleado emp: empleados2){
            System.out.println(emp);
        }
    }

    public static List<Empleado> listaEmpleados(List<Empleado> empleado, BiPredicate<Integer, String> func){
        List<Empleado> empleados = new ArrayList<>();
        for(Empleado emp:empleado){
            if(func.test(emp.getEdad(), emp.getDepartamento())){
                empleados.add(emp);
            }
        }
        return empleados;
    }

}
