import java.util.Scanner;

public class Dado {
    private int valorDado;

    public int getValorDado() {
        return valorDado;
    }

    public void setValorDado(int valorDado) {
        this.valorDado = valorDado;
    }

    public int generarNumero() {
        valorDado = (int) (Math.random() * 6) + 1;
        return valorDado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dado dado1 = new Dado();
        System.out.println("Ingrese la cantidad de tiros");
        int cantidadTiros = scanner.nextInt();
        for (int i = 1; i <= cantidadTiros; i++) {
            System.out.println("El tiro " + i + " sale: " + dado1.generarNumero());
        }
    }
}
