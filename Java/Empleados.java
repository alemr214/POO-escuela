import java.util.Scanner;

public class Empleados {
    private String nombreEmpleado;
    private float sueldoEmpleado;

    public Empleados(String nombre, float sueldo) {
        this.nombreEmpleado = nombre;
        this.sueldoEmpleado = sueldo;
    }

    public String getNombre() {
        return nombreEmpleado;
    }

    public float getSueldo() {
        return sueldoEmpleado;
    }

    public static void main(String[] args) {
        System.out.println("---Programa para registro y verificacion de empleados");
        boolean bandera = true;
        Scanner scanner = new Scanner(System.in);
        BDEmpleado miBase = new BDEmpleado();
        while (bandera == true) {
            System.out.println(
                    "\nIngresa el numero de una de las siguientes opcines\n1-Dar de alta un empleado\n2-Consulta la informacin de todos tus empleados\n3-Consulta cuantos empleados estan registrados\n4-Salir del sistema\nOpcion: ");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Ingresa el nombre del empleado: ");
                String nombre = scanner.next();
                System.out.println("Ingresa el sueldo del empleado: ");
                float sueldo = scanner.nextFloat();
                Empleados miEmpleado = new Empleados(nombre, sueldo);
                miBase.registrarEmpleado(miEmpleado);
            } else if (opcion == 2) {
                miBase.verificarRegistroEmpleados();
            } else if (opcion == 3) {
                System.out.println("Cantidad de empleados: " + miBase.verificarCantidadEmpleados());
            } else if (opcion == 4) {
                break;
            } else {
                break;
            }
        }
        scanner.close();
    }
}
