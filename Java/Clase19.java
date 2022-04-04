/**
 * Juego de caballos
 * problema: Realizar un sistema orientado a objetos que simule una carrera de
 * caballos, todos inician en la misma posición, de forma aleatoria deben
 * avanzar los caballos en un rango de 25 pasos, se debe imprimir su avance y si
 * alguno llega a la
 * derecha de la pantalla
 * 
 * Caballo1 = Figura C1
 * Caballo2 = Figura C2
 * Caballo3 = Figura C3
 */
public class Clase19 {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("Juan", "C1");
        Caballo caballo2 = new Caballo("Vicente", "C2");
        Caballo caballo3 = new Caballo("Pancho", "C3");
        Pantalla pantalla = new Pantalla(150);
        System.out.print("\033[H\033[2J");
        System.out.println(pantalla.dibujar(caballo1));
        System.out.println(pantalla.dibujar(caballo2));
        System.out.println(pantalla.dibujar(caballo3));

        int contador = 0;
        while (contador <= pantalla.getNumeroCaracteres()) {
            caballo1.avanzar();
            caballo2.avanzar();
            caballo3.avanzar();
            try {
                Thread.sleep(2000);
                System.out.print("\033[H\033[2J");
            } catch (InterruptedException e) {
            }
            System.out.println(pantalla.dibujar(caballo1));
            System.out.println(pantalla.dibujar(caballo2));
            System.out.println(pantalla.dibujar(caballo3));
            if (caballo1.getNumeroPasos() >= pantalla.getNumeroCaracteres()) {
                System.out.println("Ganador: " + caballo1.getNombre() + " " + caballo1.getFigura());
                break;
            } else if (caballo2.getNumeroPasos() >= pantalla.getNumeroCaracteres()) {
                System.out.println("Ganador: " + caballo2.getNombre() + " - " + caballo2.getFigura());
                break;
            } else if (caballo3.getNumeroPasos() >= pantalla.getNumeroCaracteres()) {
                System.out.println("Ganador: " + caballo3.getNombre() + " - " + caballo3.getFigura());
                break;
            }
            contador++;
        }

    }

}
