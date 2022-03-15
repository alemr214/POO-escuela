import java.util.Scanner;

public class Teclado {
   private String color;
   private int cantidadTeclas;

   public String getColor() {
      return color;
   }

   public int getCantidadTeclas() {
      return cantidadTeclas;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void setCantidadTeclas(int cantidadTeclas) {
      this.cantidadTeclas = cantidadTeclas;
   }

   public static void main(String[] args) {
      Teclado tecladoMK61 = new Teclado();
      Scanner scanner = new Scanner(System.in);

      String color = tecladoMK61.getColor();
      int cantidadTeclas = tecladoMK61.getCantidadTeclas();
      System.out.println("El estado actual del objeto es: ");
      System.out.println("El tamano del atributo tamano de color es: " + color);
      System.out.println("El tamano del atributo cantidadTeclas es: " + cantidadTeclas);

      System.out.println("Ingrese el color del teclado");
      String colorMK61 = scanner.nextLine();
      System.out.println("Ingrese la cantidad de teclas");
      int cantidadTeclasMK61 = scanner.nextInt();

      tecladoMK61.setColor(colorMK61);
      tecladoMK61.setCantidadTeclas(cantidadTeclasMK61);
      System.out.println("El nuevo estado actual del objeto es: ");
      System.out.println("El nuevo tamano del atributo tamano de canica1 es: " + tecladoMK61.getColor());
      System.out.println("El nuevo tamano del atributo peso de canica1 es: " + tecladoMK61.getCantidadTeclas());
   }
}