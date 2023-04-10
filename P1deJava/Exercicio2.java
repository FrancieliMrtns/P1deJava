package P1deJava;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        System.out.println("Digite o número da base do triângulo: ");
        int base = texto.nextInt();
        System.out.println("Digite o número da altura do triângulo: ");
        int altura = texto.nextInt();
        
        double area = (base * altura) / 2.0;
        System.out.println("A área do triângulo é: " + area);
        
        texto.close();
    }
}