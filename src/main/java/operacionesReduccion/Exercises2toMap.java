package operacionesReduccion;

import java.util.Map;
import java.util.stream.Collectors;

public class Exercises2toMap {

    public static void main(String[] args) {

        Map<Long,String> idToNameToMap =
                Empleado.getEmpleados()
                        .stream()
                        .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));

        idToNameToMap.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));

        Map<Empleado.Genero,String> generoEmpleado =
                Empleado.getEmpleados()
                        .stream()
                        .collect(Collectors.toMap(Empleado::getGenero, Empleado::getNombre,
                                (x,y) -> String.join("-",x,y)));

        generoEmpleado.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));


    }

}
