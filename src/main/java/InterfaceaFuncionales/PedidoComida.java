package InterfaceaFuncionales;

public class PedidoComida {

    String nombre;
    double montoPedido;
    int mesa;

    public PedidoComida(String nombre, double montoPedido, int mesa) {
        this.nombre = nombre;
        this.montoPedido = montoPedido;
        this.mesa = mesa;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
