import java.util.Scanner;

public class Clase17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la coordenada X del 1er punto: ");
        Float x1 = scanner.nextFloat();
        System.out.println("Ingrese la coordenada Y del 1er punto: ");
        Float y1 = scanner.nextFloat();
        PuntosCoordenados miPunto1 = new PuntosCoordenados(x1, y1);

        System.out.println("Ingrese la coordenada X del 2do punto: ");
        Float x2 = scanner.nextFloat();
        System.out.println("Ingrese la coordenada Y del 2do punto: ");
        Float y2 = scanner.nextFloat();
        PuntosCoordenados miPunto2 = new PuntosCoordenados(x2, y2);

        System.out.println("La distancia es: " + miPunto1.calcularDistancia(miPunto2));
        scanner.close();
    }
}
