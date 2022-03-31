public class Caballo {
    private int numeroPasos;
    private String nombre;
    private String figura;

    public Caballo(String nombre, String figura) {
        this.nombre = nombre;
        this.figura = figura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFigura() {
        return figura;
    }

    public int getNumeroPasos() {
        return numeroPasos;
    }

    public void avanzar() {
        int temporalAleatorio = (int) (Math.random() * 3) + 1;
        this.numeroPasos += temporalAleatorio;
    }

    public void avanzar(int numeroPasos) {
        this.numeroPasos += numeroPasos;
    }

    public void retroceder() {
        int temporalAleatorio = (int) (Math.random() * 3) + 1;
        if (this.numeroPasos == 0 || temporalAleatorio > this.numeroPasos) {
            System.out.println("No se puede retroceder mas");
        } else {
            this.numeroPasos -= temporalAleatorio;
        }
    }

    public void retroceder(int numeroPasos) {
        if (this.numeroPasos == 0 || numeroPasos > this.numeroPasos) {
            System.out.println("No se puede retroceder mas");
        } else {
            this.numeroPasos -= numeroPasos;
        }
    }
}
