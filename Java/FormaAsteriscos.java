import java.util.Scanner;

public class FormaAsteriscos {
    private int longitud;

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String lineaHorizontal() {
        String horizontal = "";
        for (int i = 0; i < longitud; i++) {
            horizontal = horizontal + "* ";
        }
        return horizontal;
    }

    public String lineaVertical() {
        String vertical = "";
        for (int i = 0; i < longitud; i++) {
            vertical = vertical + "*\n";
        }
        return vertical;
    }

    public String lineaEle() {
        String formaEle = "";
        setLongitud(longitud - 1);
        formaEle = formaEle + lineaVertical();
        setLongitud(longitud + 1);
        formaEle = formaEle + lineaHorizontal();
        return formaEle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FormaAsteriscos asteriscos = new FormaAsteriscos();

        System.out.println("Ingrese la cantidad de asteriscos: ");
        int cantidad = scanner.nextInt();
        asteriscos.setLongitud(cantidad);
        System.out.println("La linea horizontal queda: ");
        System.out.println(asteriscos.lineaHorizontal());
        System.out.println("\nLa linea vertical queda: ");
        System.out.println(asteriscos.lineaVertical());
        System.out.println("\nLa forma de ele(L) queda: ");
        System.out.println(asteriscos.lineaEle());
    }
}
