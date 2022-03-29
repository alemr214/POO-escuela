public class PuntosCoordenados {
    private Float x;
    private Float y;

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public PuntosCoordenados(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Float calcularDistancia(PuntosCoordenados punto2) {
        String temporal = Double
                .toString(Math.sqrt(Math.pow(punto2.getX() - this.x, 2) + Math.pow(punto2.getY() - this.y, 2)));
        Float distancia = Float.parseFloat(temporal);
        return distancia;
    }

}
