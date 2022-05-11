public class Cuenta {
    private int disponible;
    private String numeroTarjeta;

    public void aumentar_disponible(int cantidad) {
        disponible += cantidad;
    }

    public void pagar_pedido(int cantidad) {
        disponible -= cantidad;
    }
}
