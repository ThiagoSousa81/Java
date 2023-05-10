import java.util.Scanner;

public class Main {
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Entre com o valor de a: ");
      double a = scanner.nextDouble();

      System.out.println("Entre com o valor de b: ");
      double b = scanner.nextDouble();

      System.out.println("Entre com o valor de c: ");
      double c = scanner.nextDouble();

      double delta = Math.pow(b,2) - 4*a*c;

      if(delta < 0){
         System.out.println("Não há raízes reais.");
         System.out.println(delta);
      } else {
         double x1 = (-b + Math.sqrt(delta)) / (2*a);
         double x2 = (-b - Math.sqrt(delta)) / (2*a);

         System.out.println("x1 = " + x1 + " e x2 = " + x2);
      }
        }
      
   }
}
