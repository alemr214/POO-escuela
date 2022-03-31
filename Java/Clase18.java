import java.util.Scanner;

public class Clase18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del caballo: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la figura del caballo: ");
        String figura = scanner.nextLine();
        Caballo caballo = new Caballo(nombre, figura);
        System.out.println("Ingrese el numero de caracteres que caben en su consola: ");
        int numeroCaracteres = scanner.nextInt();
        Pantalla pantalla = new Pantalla(numeroCaracteres);

        boolean bandera = true;
        while (bandera == true) {
            System.out.println("Desea establecer el numero de pasos o que " + caballo.getNombre()
                    + " se mueva aleatoriamente? (1) Establecer numero de pasos (2) Moverse aleatoriamente");
            int desicion = scanner.nextInt();
            if (desicion == 1) {
                System.out.println("Ingrese el numero de pasos: ");
                int numeroPasos = scanner.nextInt();
                System.out.println("Desea avanzar o retroceder? (1) Avanzar (2) Retroceder");
                int opcion = scanner.nextInt();
                if (opcion == 1) {
                    caballo.avanzar(numeroPasos);
                } else if (opcion == 2) {
                    caballo.retroceder(numeroPasos);
                } else {
                    bandera = false;
                }
            } else if (desicion == 2) {
                System.out.println("Desea avanzar o retroceder? (1) Avanzar (2) Retroceder");
                int opcion = scanner.nextInt();
                if (opcion == 1) {
                    caballo.avanzar();
                } else if (opcion == 2) {
                    caballo.retroceder();
                } else {
                    bandera = false;
                }
            } else {
                bandera = false;
            }
            System.out.println(pantalla.dibujar(caballo));
        }
        scanner.close();

    }
}
