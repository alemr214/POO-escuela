public class Pantalla {
    private int numeroCaracteres;

    public Pantalla(int numeroCaracteres) {
        this.numeroCaracteres = numeroCaracteres;
    }

    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }

    public String dibujar(Caballo caballo) {
        String trayectoria = "";
        for (int i = 1; i < caballo.getNumeroPasos(); i++) {
            trayectoria = trayectoria + " ";
            if (i == caballo.getNumeroPasos() - 1 && i <= this.numeroCaracteres - 9) {
                trayectoria = trayectoria + caballo.getFigura();
            } else if (i > this.numeroCaracteres - 9) {
                trayectoria = trayectoria + caballo.getFigura();
                break;
            }

        }
        if (caballo.getNumeroPasos() == 0) {
            trayectoria = caballo.getFigura();
        }
        return "Salida: " + trayectoria;
    }
}
