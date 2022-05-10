public class Libro extends Publicacion {
    protected int numeroPaginas;

    public Libro(String titulo, float precio, int numeroPaginas) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        return "Estado: \n" + "Titulo: " + titulo + " Precio: " + precio + " Numero de paginas: " + numeroPaginas;
    }
}
