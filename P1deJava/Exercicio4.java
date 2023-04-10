package P1deJava;
import java.util.Scanner;

public class Exercicio4 {
   public static void main(String[] args) {
      Scanner texto = new Scanner(System.in);
      
      System.out.print("Digite o tipo de investimento: ");
      String tipoInvest = texto.nextLine();
      System.out.print("Agora digite o valor do investimento: ");
      double valor = texto.nextDouble();
      double Vcorrigido;
      
      if (tipoInvest.equals("a")) {
         Vcorrigido = valor * 1.03; 
         
      } else if (tipoInvest.equals("b")) {
         Vcorrigido = valor * 1.04; 
         
      } else {
         System.out.println("Tipo de investimento inválido.");
         return;
      }

      
      System.out.println("Valor corrigido: R$ " + Vcorrigido);
      
      texto.close();
   }
}
