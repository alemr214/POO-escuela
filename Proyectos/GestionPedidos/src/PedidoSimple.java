import java.util.ArrayList;

public class PedidoSimple extends Pedido {

    public int obtenertotal() {
        return 0;
    }

    public boolean cobrar() {
        return true;
    }

    public void obtenerDetalle() {

    }

    public ArrayList<Cuenta> obtenerCuentas() {
        return null;
    }

}
