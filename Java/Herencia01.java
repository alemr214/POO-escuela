public class Herencia01 {

    public static void main(String[] args) {
        EmpleadoDistribucion empleadoDistribucion = new EmpleadoDistribucion("Juan", 12345678, 10, "Norte");
        System.out.println("Nombre: " + empleadoDistribucion.getNombre());
        System.out.println("DNI: " + empleadoDistribucion.getDni());
        System.out.println("Dias de vacaciones: " + empleadoDistribucion.getDiasVacaciones());
        System.out.println("Zona: " + empleadoDistribucion.getZona());
    }
}
