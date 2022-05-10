public class CD extends Publicacion {
    protected float tiempo;

    public CD(String titulo, float precio, float tiempo) {
        super(titulo, precio);
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public String toString() {
        return "Estado: \n" + "Titulo: " + titulo + " Precio: " + precio + " Tiempo: " + tiempo;
    }
}
