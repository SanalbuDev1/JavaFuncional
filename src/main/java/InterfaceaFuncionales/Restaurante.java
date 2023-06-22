package InterfaceaFuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Restaurante {

    public static void main(String[] args) {
        PedidoComida pedidoComida = new PedidoComida("Pizza",10000.1d,3);
        String nombre = (String) getDatoPedidoComida(pedidoComida, (x) -> x.getNombre());
        Double precio = (Double) getDatoPedidoComida(pedidoComida, (x) -> x.getMontoPedido());
        Integer mesa = (Integer) getDatoPedidoComida(pedidoComida, (x) -> x.getMesa());

        System.out.printf("nombre %s precio %f mesa %d ", nombre, precio, mesa);

        // obtener lista de pedidos
        PedidoComida pedidoComida2 = new PedidoComida("Pizza2",10000.1d,3);
        PedidoComida pedidoComida3 = new PedidoComida("hamburguesa",2100.1d,2);
        PedidoComida pedidoComida4 = new PedidoComida("lasaña",32000.1d,2);
        List<PedidoComida> pedidoComidaLista = new ArrayList<>();
        pedidoComidaLista.add(pedidoComida);
        pedidoComidaLista.add(pedidoComida2);
        pedidoComidaLista.add(pedidoComida3);
        pedidoComidaLista.add(pedidoComida4);

        List<Object> datos = getDatosPedidosComida(pedidoComidaLista, x-> "Nombre->" + x.getNombre() + " precio -> " +x.getMontoPedido()+" mesa "+x.getMesa());
        for(Object dato:datos)
        {
            System.out.printf("%s%n", dato);
        }
    }

    public static Object getDatoPedidoComida(PedidoComida pedidoComida,
                                             Function<PedidoComida,Object> func){
        return func.apply(pedidoComida);
    }

    public static List<Object> getDatosPedidosComida(List<PedidoComida> pedidoComidas,
                                                     Function<PedidoComida,Object> func){
        List<Object> lista = new ArrayList<>();
        for(PedidoComida pedido: pedidoComidas){
            lista.add(func.apply(pedido));
        }
        return lista;
    }



}
