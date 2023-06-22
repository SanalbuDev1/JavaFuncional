package InterfaceaFuncionales;

import java.util.function.BiFunction;

public class BiFunctionIMPLEjercicio1 {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,String> function = (x,y) -> "La suma es " + (x + y) ;
        String suma = function.apply(2,4);
        System.out.printf("Resultado %s ", suma);

        String ope = calcularOperaciones(10d,10d,(x,y) -> {
            System.out.printf("El valor de la suma es %s %n", x + y);
            return "El valor de la suma es %s" + (x + y);
        });

        ope = calcularOperaciones(10d,10d,(x,y) -> {
            System.out.printf("El valor de la resta es %s %n", x - y);
            return "El valor de la suma es %s" + (x - y);
        });


    }

    public static String calcularOperaciones(Double val1,
                                             Double val2,
                                             BiFunction<Double,Double,String> func){
        return func.apply(val1,val2);
    }

    /*
    public static String calcularOpeSuma(Double val1, Double val2){
       return Calculadora.calc((x,y) -> "La suma es " +  (x + y), val1,val2 );
    }

    public static String calcularOpeResta(Double val1, Double val2){
        return Calculadora.calc((x,y) -> "La resta es " +  (x - y), val1,val2 );
    }

    public static String calcularOpeDivi(Double val1, Double val2){
        return Calculadora.calc((x,y) -> "La division es " +  (x / y), val1,val2 );
    }

    public static String calcularOpeMult(Double val1, Double val2){
        return Calculadora.calc((x,y) -> "La multiplicacion es " +  (x * y), val1,val2 );
    }*/

}
