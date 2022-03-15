public class Autobus {
   private float kilometraje;
   private String color;

   public float getKilometraje() {
      return kilometraje;
   }

   public String getColor() {
      return color;
   }

   public void setKilometraje(float kilometraje) {
      this.kilometraje = kilometraje;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public static void main(String[] args) {
      Autobus norteSur = new Autobus();

      float kilometraje = norteSur.getKilometraje();
      String color = norteSur.getColor();
      System.out.println("El kilometraje es:" + kilometraje);
      System.out.println("El color es: " + color);
   }
}
