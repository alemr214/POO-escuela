import java.util.Scanner;

public class Automovil {
   private float velocidad;
   private float velocidadMaxima;

   public float getVelocidad() {
      return velocidad;
   }

   public float getVelocidadMaxima() {
      return velocidadMaxima;
   }

   public void setVelocidad(float velocidad) {
      this.velocidad = velocidad;
   }

   public void setVelocidadMaxima(float velocidadMaxima) {
      this.velocidadMaxima = velocidadMaxima;
   }

   public Automovil() {
      velocidadMaxima = 90;
   }

   public boolean determinaExcede() {
      boolean excede;
      if (velocidad > velocidadMaxima) {
         excede = true;
      } else {
         excede = false;
      }
      return excede;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Automovil automovil1 = new Automovil();

      System.out.println("Ingrese la velocidad a la que va el automovil");
      float velocidad = scanner.nextFloat();
      automovil1.setVelocidad(velocidad);
      boolean excede = automovil1.determinaExcede();
      if (excede == true) {
         System.out.println("El auto excede la velocidad maxima 90 km/h");
      } else {
         System.out.println("El auto no excede la velocidad maxima de 90 km/h");
      }
      scanner.close();
   }
}
