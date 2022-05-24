public class Vehiculo {
    private float velocidad;
    private String propulsion;
    private String color;
    private int precio;

    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad -= 10;
    }

}
