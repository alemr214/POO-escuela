public class Fracciones {
    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracciones sumar(Fracciones otra) {
        int n = numerador * otra.getDenominador() + denominador * otra.getNumerador();
        int d = denominador * otra.getDenominador();
        Fracciones objetoSuma = new Fracciones(n, d);
        return objetoSuma;
    }

    public static void main(String[] args) {
        Fracciones m = new Fracciones(4, 5);
        Fracciones n = new Fracciones(2, 3);

        Fracciones s;
        s = m.sumar(n);

        System.out.println("Numerador: " + s.getNumerador());
        System.out.println("Denominador: " + s.getDenominador());
    }
}
