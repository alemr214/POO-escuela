public class Herencia05 {
    public static void main(String[] args) {
        Publicacion p = new Publicacion("El Hobbit", 10);
        System.out.println(p.toString());

        Libro l = new Libro("El Hobbit", 10, 100);
        System.out.println(l.toString());

        CD c = new CD("El Hobbit", 10, 100);
        System.out.println(c.toString());
    }
}
