import java.util.ArrayList;

public class Pedido {
    private int total;
    private EstadoPedido estado;

    public boolean cobrar() {
        return true;
    }

    public void servir() {
        estado.servido();
    }

    public void confirmar() {
        estado.confirmado();
    }

    public int obtenerTotal() {
        return total;
    }

    public void obtenerDetalle() {

    }

    public ArrayList<Cuenta> obtenerCuentas() {
        return null;
    }

    public boolean addProducto(Producto producto, int num) {
        return true;
    }
}
