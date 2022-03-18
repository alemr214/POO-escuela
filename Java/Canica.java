public class Canica {
   private String tamano;
   private float peso;

   public String getTamano() {
      return tamano;
   }

   public float getPeso() {
      return peso;
   }

   public void setTamano(String tamano) {
      this.tamano = tamano;
   }

   public void setPeso(float peso) {
      this.peso = peso;
   }

   public static void main(String[] args) {
      Canica canica1 = new Canica();

      String tamano = canica1.getTamano();
      float peso = canica1.getPeso();
      System.out.println("El estado actual del objeto es: ");
      System.out.println("El tamano del atributo tamano de canica1 es: " + tamano);
      System.out.println("El tamano del atributo peso de canica1 es: " + peso);

      String tamano1 = "Grande";
      float peso1 = (float) 12.3;
      canica1.setTamano(tamano1);
      canica1.setPeso(peso1);

      System.out.println("El nuevo estado actual del objeto es: ");
      System.out.println("El nuevo tamano del atributo tamano de canica1 es: " + canica1.getTamano());
      System.out.println("El nuevo tamano del atributo peso de canica1 es: " + canica1.getPeso());
   }

}
