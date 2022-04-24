import java.util.Scanner;

public class Clase20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese el titulo del menu: ");
        String titulo = scanner.nextLine();
        System.out.println("\nIngrese la instruccion de seleccion: ");
        String instruccionSeleccion = scanner.nextLine();
        Menu menu = new Menu(titulo, instruccionSeleccion);
        while (menu.getNumeroOpciones() < 10) {
            System.out.println("\nIngrese una opcion");
            String opcion = scanner.next();
            menu.agregarOpcion(opcion);
        }
        System.out.println(
                "Ingrese el tipo de vineta: \n1 - numeros \n2 - numeros romanos \n3 - numeros romanos minusculas \n4 - letras mayusculas \n5 - letras minusculas");
        int tipoVineta = scanner.nextInt();
        switch (tipoVineta) {
            case 1:
                menu.imprimir(0);
                break;
            case 2:
                menu.imprimir(1);
                break;
            case 3:
                menu.imprimir(2);
                break;
            case 4:
                menu.imprimir(3);
                break;
            case 5:
                menu.imprimir(4);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("\nIngrese la opción que desea seleccionar: ");
        int opcionSeleccionada = scanner.nextInt();
        System.out.println("Opcion elegida: " + menu.seleccionarOpcion(opcionSeleccionada));
        scanner.close();
    }
}
