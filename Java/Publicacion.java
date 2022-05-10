public class Publicacion {

    protected String titulo;
    protected float precio;

    public Publicacion(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Estado: \n" + "Titulo: " + titulo + " Precio: " + precio;
    }
}