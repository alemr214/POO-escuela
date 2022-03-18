import java.util.Scanner;

public class Operador {
   private int operando1;
   private int operando2;

   Operador(int operando1, int operando2) {
      this.operando1 = operando1;
      this.operando2 = operando2;
   }

   public void setOperando1(int operando1) {
      this.operando1 = operando1;
   }

   public void setOperando2(int operando2) {
      this.operando2 = operando2;
   }

   public int getOperando1() {
      return operando1;
   }

   public int getOperando2() {
      return operando2;
   }

   public int sumar() {
      int suma = 0;
      suma = operando1 + operando2;
      return suma;
   }

   public int restar() {
      int resta = 0;
      resta = operando1 - operando2;
      return resta;
   }

   public int multiplicar() {
      int multiplcacion = 0;
      multiplcacion = operando1 * operando2;
      return multiplcacion;
   }

   public float dividir() {
      float division = 0;
      division = operando1 / operando2;
      return division;
   }

   public int modular() {
      int residuo = 0;
      residuo = operando1 % operando2;
      return residuo;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese el primer valor");
      int numero1 = scanner.nextInt();
      System.out.println("Ingrese el segundo valor");
      int numero2 = scanner.nextInt();

      Operador operador = new Operador(numero1, numero2);
      int operarSuma = operador.sumar();
      System.out.println("La suma es: " + operarSuma);
      int operarResta = operador.restar();
      System.out.println("La resta es: " + operarResta);
      int operarMultiplicacion = operador.multiplicar();
      System.out.println("La multiplicacion es: " + operarMultiplicacion);
      float operarDivision = operador.dividir();
      System.out.println("La division es: " + operarDivision);
      int operarResiduo = operador.modular();
      System.out.println("El residuo es: " + operarResiduo);
      scanner.close();
   }
}
