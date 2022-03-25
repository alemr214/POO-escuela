import java.util.Scanner;

public class FigurasGeometricas {

    public static float calcularAreaRectangulo(float base, float altura) {
        float area = base * altura;
        return area;
    }

    public static float calcularAreaTriangulo(float base, float altura) {
        float area = (base * altura) / 2;
        return area;
    }

    public static float calcularAreaTrapecio(float baseMayor, float baseMenor, float altura) {
        float area = ((baseMayor + baseMenor) * altura) / 2;
        return area;
    }

    public static float calcularAreaCirculo(float radio) {
        float area = (float) (Math.PI * Math.pow(radio, 2));
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Programa para calcular el area de figuras geometricas---");
        boolean bandera = true;
        while (bandera == true) {
            System.out.println(
                    "Ingrese el numero de las siguientes opciones para elegier:\n1-Rectangulo\n2-Triangulo\n3-Trapecio\n4-Circulo\n");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el valor de la base: ");
                float base = scanner.nextFloat();
                System.out.println("Ingrese el valor de la altura: ");
                float altura = scanner.nextFloat();
                float area = FigurasGeometricas.calcularAreaRectangulo(base, altura);
                System.out.println("El area es: " + area + " unidades cuadradas");
            } else if (opcion == 2) {
                System.out.println("Ingrese el valor de la base: ");
                float base = scanner.nextFloat();
                System.out.println("Ingrese el valor de la altura: ");
                float altura = scanner.nextFloat();
                float area = FigurasGeometricas.calcularAreaTriangulo(base, altura);
                System.out.println("El area es: " + area + " unidades cuadradas");
            } else if (opcion == 3) {
                System.out.println("Ingrese el valor de la base mayor: ");
                float baseMayor = scanner.nextFloat();
                System.out.println("Ingrese el valor de la base menor: ");
                float baseMenor = scanner.nextFloat();
                System.out.println("Ingrese el valor de la altura: ");
                float altura = scanner.nextFloat();
                float area = FigurasGeometricas.calcularAreaTrapecio(baseMayor, baseMenor, altura);
                System.out.println("El area es: " + area + " unidades cuadradas");
            } else if (opcion == 4) {
                System.out.println("Ingrese el valor del radio: ");
                float radio = scanner.nextFloat();
                float area = FigurasGeometricas.calcularAreaCirculo(radio);
                System.out.println("El area es: " + area + " unidades cuadradas");
            } else {
                System.out.println("Opcion incorrecta");
                break;
            }
            System.out.println("Desea operar otra figura geometrica?\n1-Si\n2-No\n");
            int salida = scanner.nextInt();
            if (salida == 1) {
                bandera = true;
            } else if (salida == 2) {
                bandera = false;
            } else {
                System.out.println("Opcion invalida");
                bandera = false;
            }
        }
        scanner.close();
    }
}
