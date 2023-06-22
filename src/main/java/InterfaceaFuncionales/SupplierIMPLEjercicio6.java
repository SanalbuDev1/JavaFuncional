package InterfaceaFuncionales;

import java.util.function.Supplier;

public class SupplierIMPLEjercicio6 {

    public static void main(String[] args) {
        Supplier<String> obtener = () -> "Hola mundo" ;
        String respuesta = obtener.get();
        System.out.println(respuesta);
    }

}
