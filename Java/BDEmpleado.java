import java.util.ArrayList;

public class BDEmpleado {
    private ArrayList<Empleados> empleados;

    public BDEmpleado() {
        empleados = new ArrayList<Empleados>();
    }

    public void registrarEmpleado(Empleados empleadito) {
        empleados.add(empleadito);
    }

    public void verificarRegistroEmpleados() {
        for (Empleados registro : empleados) {
            System.out.println("Nombre: " + registro.getNombre() + " sueldo: $" + registro.getSueldo());
        }
    }

    public int verificarCantidadEmpleados() {
        int cantidad = empleados.size();
        return cantidad;
    }

}
