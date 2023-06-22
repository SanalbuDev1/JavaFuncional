package InterfaceaFuncionales;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerIMPLEjercicio5 {

    static List<Estudiante> estudiante;

    static {
        estudiante = Arrays.asList(new Estudiante("Carlos",2d),
                new Estudiante("Roberto",3d));
    }
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> dato = (x1,x2) -> {
            int i = x1 + x2;
            System.out.println(i);
        };

        dato.accept(10,10);

        // aprobar estudiantes

        BiConsumer<Estudiante,Double> mostrarEstudiante = (estudiante,porcentaje) ->
        {
            System.out.printf("Nombre del estudiante %s Nota del estudiante %f el porcentaje a incrementar es %f %n ",
                    estudiante.getNombre(),estudiante.getCalificacion(),porcentaje);
        };

        BiConsumer<Estudiante,Double> subirNota = (estudiante,porcentaje) ->  {
            estudiante.setCalificacion(estudiante.getCalificacion()*porcentaje);
        };

        /*
        Primero se ejecuta el mostrar estudiante despues actualizar nota
        despues se vuelve a ejecutar el mostrar estudiante con los datos actualizados
         */
        operacionEstudiante(estudiante,1.5d,mostrarEstudiante
                .andThen(subirNota
                        .andThen(mostrarEstudiante)));
    }

    public static void operacionEstudiante(List<Estudiante> estudiante,Double porcentaje, BiConsumer<Estudiante,Double> func){

        for (Estudiante estu: estudiante){
            func.accept(estu,porcentaje);
        }

    }

}
