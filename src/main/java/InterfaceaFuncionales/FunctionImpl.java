package InterfaceaFuncionales;

import java.util.function.Function;

/**
 * @Author Santiago Alvarez
 */

public class FunctionImpl {

    public static void main(String[] args) {
        Function<Integer, String> convertidorLegacy =
                new Function<Integer, String>() {
                    @Override
                    public String apply(Integer x) {
                        return Integer.toString(x);
                    }
                };

        Function<Integer,String> convertidor =
                (x) -> Integer.toString(x);

        System.out.println("Metodo legado -> " + convertidorLegacy.apply(1000).length());
        System.out.println("Metodo actual -> " + convertidor.apply(1000).length());

    }

}
