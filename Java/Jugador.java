import java.util.Scanner;

public class Jugador {
    private String nombre;
    private int jugadasGanadas;
    private int jugadasPerdidas;
    private int jugadasEmpatadas;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void incrementarJugadasGanadas() {
        jugadasGanadas++;
    }

    public void incrementarJugadasPerdidas() {
        jugadasPerdidas++;

    }

    public void incrementarJugadasEmpatadas() {
        jugadasEmpatadas++;
    }

    public int lanzarDado(Dado dado) {
        return dado.generarNumero();
    }

    public String getNombre() {
        return nombre;
    }

    public int getJugadasGanadas() {
        return jugadasGanadas;
    }

    public int getJugadasPerdidas() {
        return jugadasPerdidas;
    }

    public int getJugadasEmpatadas() {
        return jugadasEmpatadas;
    }

    public String determinarGanador(Jugador jugador) {
        if (jugadasGanadas > jugador.getJugadasGanadas()) {
            return nombre;
        } else if (jugadasGanadas < jugador.getJugadasGanadas()) {
            return jugador.getNombre();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del jugador 1: ");
        String nombreJugador1 = scanner.next();
        System.out.println("Ingresa el nombre del jugador 2: ");
        String nombreJugador2 = scanner.next();
        Jugador jugador1 = new Jugador(nombreJugador1);
        Jugador jugador2 = new Jugador(nombreJugador2);
        Dado dado = new Dado();

        int valorjugador1, valorjugador2;
        for (int i = 1; i <= 5; i++) {
            valorjugador1 = jugador1.lanzarDado(dado);
            valorjugador2 = jugador2.lanzarDado(dado);

            if (valorjugador1 > valorjugador2) {
                jugador1.incrementarJugadasGanadas();
                jugador2.incrementarJugadasPerdidas();
            } else if (valorjugador1 < valorjugador2) {
                jugador1.incrementarJugadasPerdidas();
                jugador2.incrementarJugadasGanadas();
            } else {
                jugador1.incrementarJugadasEmpatadas();
                jugador2.incrementarJugadasEmpatadas();
            }
        }
        System.out.println(
                "Estadisticas de: " + jugador1.getNombre() + "\nJugadas ganadas: " + jugador1.getJugadasGanadas()
                        + "\nJugadas perdidas: " + jugador1.getJugadasPerdidas() + "\nJugadas empatadas: "
                        + jugador1.getJugadasEmpatadas());
        System.out.println(
                "Estadisticas de: " + jugador2.getNombre() + "\nJugadas ganadas: " + jugador2.getJugadasGanadas()
                        + "\nJugadas perdidas: " + jugador2.getJugadasPerdidas() + "\nJugadas empatadas: "
                        + jugador2.getJugadasEmpatadas());
        System.out.println(jugador1.determinarGanador(jugador2) + " Es el ganador");
        scanner.close();
    }
}