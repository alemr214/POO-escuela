import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class AlmacenamientoTexto implements Almacenamiento {
    private String nombreArchivo;

    public AlmacenamientoTexto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardar(String nombre, float altura, int edad) {
        try {
            FileWriter fw = new FileWriter(this.nombreArchivo + ".txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(nombre + "," + altura + "," + edad);
            pw.flush();
            pw.close();
            JOptionPane.showMessageDialog(null, "Creado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modificar() {

    }

    public void consultar() {

    }
}
