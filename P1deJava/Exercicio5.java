package P1deJava;
import java.util.Scanner;

public class Exercicio5 {
   public static void main(String[] args) {
      Scanner texto = new Scanner(System.in);

      double[] temperaturas = new double[12];

      
      for (int i = 0; i < 12; i++) {
         System.out.print("Digite a temperatura média do mês " + (i+1) + ": ");
         temperaturas[i] = texto.nextDouble();
      }

      double maiorTemp = temperaturas[0];
      double menorTemp = temperaturas[0];
      int indiceMaiorTemperatura = 0;
      int indiceMenorTemperatura = 0;
      for (int i = 1; i < 12; i++) {
         if (temperaturas[i] > maiorTemp) {
            maiorTemp = temperaturas[i];
            indiceMaiorTemperatura = i;
         }
         if (temperaturas[i] < menorTemp) {
            menorTemp = temperaturas[i];
            indiceMenorTemperatura = i;
         }
      }

      String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
      System.out.println("Maior temperatura: " + maiorTemp + " em " + meses[indiceMaiorTemperatura]);
      System.out.println("Menor temperatura: " + menorTemp + " em " + meses[indiceMenorTemperatura]);
   }
}