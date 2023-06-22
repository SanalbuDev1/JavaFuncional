package InterfaceaFuncionales;

import java.util.function.BiFunction;

public class Calculadora {

    public static String calc(BiFunction<Double,Double,String> bi, Double variable1, Double variable2){

        return bi.apply(variable1,variable2);

    }

}
