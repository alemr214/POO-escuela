import java.util.Scanner;

public class PuntosCoordenados {
    private Float x1;
    private Float x2;
    private Float y1;
    private Float y2;

    public void setX1(Float x1) {
        this.x1 = x1;
    }

    public void setX2(Float x2) {
        this.x2 = x2;
    }

    public void setY1(Float y1) {
        this.y1 = y1;
    }

    public void setY2(Float y2) {
        this.y2 = y2;
    }

    public Float calcularDistancia() {
        String temporal = Double.toString(Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2)));
        Float distancia = Float.parseFloat(temporal);
        return distancia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PuntosCoordenados misCoordenadas = new PuntosCoordenados();
        System.out.println("Ingrese la coordenada X del 1er punto: ");
        String x1 = scanner.nextLine();
        System.out.println("Ingrese la coordenada Y del 1er punto: ");
        String y1 = scanner.nextLine();
        System.out.println("Ingrese la coordenada X del 2do punto: ");
        String x2 = scanner.nextLine();
        System.out.println("Ingrese la coordenada Y del 2do punto: ");
        String y2 = scanner.nextLine();

        Float coordenadaX1 = Float.parseFloat(x1);
        misCoordenadas.setX1(coordenadaX1);
        Float coordenadaY1 = Float.parseFloat(y1);
        misCoordenadas.setY1(coordenadaY1);
        Float coordenadaX2 = Float.parseFloat(x2);
        misCoordenadas.setX2(coordenadaX2);
        Float coordenadaY2 = Float.parseFloat(y2);
        misCoordenadas.setY2(coordenadaY2);

        System.out.println("La distancia es: " + misCoordenadas.calcularDistancia());
        scanner.close();
    }
}
