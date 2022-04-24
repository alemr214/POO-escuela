import java.util.ArrayList;

public class Menu {
    // Atributos base del menu
    private ArrayList<String> opciones;
    private int numeroOpciones;
    private String opcionSeleccionada;
    private String titulo;
    private String instruccionSeleccion;

    // Vinetas preestablecidas en una matriz
    private String vineta[][];

    // Constructor
    public Menu(String titulo, String instruccionSeleccion) {
        this.titulo = titulo;
        this.instruccionSeleccion = instruccionSeleccion;
        opciones = new ArrayList<String>();
        numeroOpciones = 0;
        opcionSeleccionada = "";
        String vinetasA[][] = {
                { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" },
                { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" },
                { "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x" },
                { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" },
                { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" }
        };
        this.vineta = vinetasA;
    }

    // Metodos
    public void agregarOpcion(String opcion) {
        opciones.add(opcion);
        numeroOpciones++;
    }

    public void imprimir(int tipoVineta) {
        System.out.println("\n" + titulo);
        for (int i = 0; i < numeroOpciones; i++) {
            System.out.println(vineta[tipoVineta][i] + " - " + opciones.get(i));
        }
        System.out.println("\n" + instruccionSeleccion);
    }

    public String seleccionarOpcion(int opcion) {
        opcionSeleccionada = opciones.get(opcion - 1);
        return opcionSeleccionada;
    }

    public int getNumeroOpciones() {
        return numeroOpciones;
    }

}