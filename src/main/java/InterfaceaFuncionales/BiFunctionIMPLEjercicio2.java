package InterfaceaFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionIMPLEjercicio2 {


    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Ana",3000d),
                new Empleado("Ana maria",4000d),
                new Empleado("Santiago",5000d),
                new Empleado("Kelly",6000d)
        );

        List<String> salarios = calcEmpleado((x,y) -> "El salario actual es de " + x +
                " El incremento es del 10% -> resultado salario generado"
                + (x+(x*y)) +"\n"
                , empleados, 0.10);

        for(String salario:salarios){
            System.out.print(salario);
        }
    }

    /*
    Este metodo calcula junto al salario actual del empleado y un incremento
     */
    public static List<String> calcEmpleado(BiFunction<Double,Double,String> func, List<Empleado> empleados, Double incremento){

        List<String> incrementoS = new ArrayList<>();
        for(Empleado emp: empleados){
            incrementoS.add(func.apply(emp.getSalario(), incremento));
        }
        return incrementoS;
    }

}
