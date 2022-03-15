import java.util.Scanner;

public class Cartera {
   private int numeroBolsillos;
   private String tipo;

   public int getNumeroBolsillos() {
      return numeroBolsillos;
   }

   public String getTipo() {
      return tipo;
   }

   public void setNumeroBolsillos(int numeroBolsillos) {
      this.numeroBolsillos = numeroBolsillos;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public Cartera(int numeroBolsillos, String Tipo) {
      this.numeroBolsillos = numeroBolsillos;
      tipo = Tipo;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingresa el numero de bolsillos");
      int numeroBolsillo = scanner.nextInt();
      System.out.println("Ingresa el tipo de cartera");
      scanner.nextLine();
      String tipoCartera = scanner.nextLine();

      Cartera cartera1 = new Cartera(numeroBolsillo, tipoCartera);
      System.out.println("El estado del objeto es");
      System.out.println("El numero de bolsillos es: " + cartera1.getNumeroBolsillos());
      System.out.println("El tipo es: " + cartera1.getTipo());

      Cartera cartera2 = new Cartera(4, "hombre");
      System.out.println("El estado del objeto es");
      System.out.println("El numero de bolsillos es: " + cartera2.getNumeroBolsillos());
      System.out.println("El tipsio es: " + cartera2.getTipo());

      scanner.close();
   }

}
