package InterfaceaFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIMPLEjercicio5 {

    /**
     * description: nos permite hacer algo con ese parametro de entrada
     * ya que esta interfaz funcional no retornara nada, solo ejecutara algo
     * @param args
     */

    static List<Estudiante> estudiante;

    static {
        estudiante = Arrays.asList(new Estudiante("Carlos",2d),
                new Estudiante("Roberto",3d));
    }
    public static void main(String[] args) {

        Consumer<Integer> dato = (x) -> {
            int i = x + 10;
            System.out.println(i);
        };

        dato.accept(10);

        // aprobar estudiantes

        Consumer<Estudiante> mostrarEstudiante = (estudiante) ->
        {
            System.out.printf("Nombre del estudiante %s Nota del estudiante %f %n",
                    estudiante.getNombre(),estudiante.getCalificacion());
        };

        Consumer<Estudiante> subirNota = (estudiante) ->  {
            estudiante.setCalificacion(estudiante.getCalificacion()*1.30);
        };

        /*
        Primero se ejecuta el mostrar estudiante despues actualizar nota
        despues se vuelve a ejecutar el mostrar estudiante con los datos actualizados
         */
        operacionEstudiante(estudiante,mostrarEstudiante
                .andThen(subirNota
                        .andThen(mostrarEstudiante)));

    }
    public static void operacionEstudiante(List<Estudiante> estudiante, Consumer<Estudiante> func){

        for (Estudiante estu: estudiante){
            func.accept(estu);
        }

    }

}
