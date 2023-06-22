package InterfaceaFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Esta clase nos evalua una cierta cantidad de empleados creados
 *  estaticamente simulando un BD, adicional creamos un metodo evaluador
 *  de tipo interfaz funcional Predicate esta a su vez lo que hace es
 *  que nos evalua cierta condicion que le propogamos
 *
 * @version 1.0
 * @since 2023-06-09
 * @author Sanalbu
 */
public class PredicateIMPLEjercicio3 {

    static List<Empleado> empleados = new ArrayList<>();

    static {
        empleados = Arrays.asList(
                new Empleado("Ana",3000d, 25, Departamentos.CALDAS.getCiudad()),
                new Empleado("Ana maria",4000d,30, Departamentos.ANTIQUITA.getCiudad()),
                new Empleado("Santiago",5000d, 28, Departamentos.CALDAS.getCiudad()),
                new Empleado("Kelly",6000d, 41, Departamentos.CALDAS.getCiudad())
        );
    }
    public static void main(String[] args) {

        // ejemplo 1
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> listaFiltro = (x) -> x >= 5;
        System.out.println("Numeros mayores o iguales 5 ");
        lista.forEach((numero) -> {
            if(listaFiltro.test(numero)){
                System.out.println(numero);
            }
        });

        // se obtiene los salarios mayores a 3000
        List<Empleado> listaEmpleado = listaEmpleadorEvaluar((x) -> x.getSalario() > 3000);
        for(Empleado emp: listaEmpleado){
            System.out.println(emp);
        }

        System.out.println();

        // se obtiene los salarios mayores a 3000
        List<Empleado> listaEmpleado2 = listaEmpleadorEvaluarContrarios((x) -> x.getSalario() > 3000);
        for(Empleado emp: listaEmpleado2){
            System.out.println(emp);
        }

        System.out.println();

        // se obtiene los salarios mayores a 3000
        List<Empleado> listaEmpleado3 = listaEmpleadorEvaluarEquals((x) -> x.getSalario() > 3000);
        for(Empleado emp: listaEmpleado2){
            System.out.println(emp);
        }
    }

    /**
     * @param funcEvaluador evalua unas condiciones dadas
     * @return lista de empleados
     */
    static public List<Empleado> listaEmpleadorEvaluar(Predicate<Empleado> funcEvaluador){
        List<Empleado> listaEmpleado = new ArrayList<>();
        for(Empleado emp: empleados){
            if(funcEvaluador.test(emp)){
                listaEmpleado.add(emp);
            }
        }
        return listaEmpleado;
    }

    static public List<Empleado> listaEmpleadorEvaluarContrarios(Predicate<Empleado> funcEvaluador){
        List<Empleado> listaEmpleado = new ArrayList<>();
        for(Empleado emp: empleados){
            if(funcEvaluador.negate().test(emp)){
                listaEmpleado.add(emp);
            }
        }
        return listaEmpleado;
    }

    static public List<Empleado> listaEmpleadorEvaluarEquals(Predicate<Empleado> funcEvaluador){
        List<Empleado> listaEmpleado = new ArrayList<>();
        for(Empleado emp: empleados){
            if(funcEvaluador.equals(emp)){
                listaEmpleado.add(emp);
            }
        }
        return listaEmpleado;
    }


}
