public class Main {
    public static void main(String[] args) {
        Persona alejandro = new Persona("Alejandro", 1.75f, 20);
        AlmacenamientoTexto almacenamientoTexto = new AlmacenamientoTexto("persona");
        AlmacenamientoExcel almacenamientoExcel = new AlmacenamientoExcel("persona");
        AlmacenamientoPDF almacenamientoPDF = new AlmacenamientoPDF("persona");
        almacenamientoTexto.guardar(alejandro.getNombre(), alejandro.getAltura(), alejandro.getEdad());
        almacenamientoExcel.guardar(alejandro.getNombre(), alejandro.getAltura(), alejandro.getEdad());
        almacenamientoPDF.guardar(alejandro.getNombre(), alejandro.getAltura(), alejandro.getEdad());
    }
}
