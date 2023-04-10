package P1deJava;
import java.util.Scanner;

public class Exercicio1 {
	 public static void main(String[] args){
		 Scanner texto = new Scanner(System.in);
		 int quadrado;
		 
		 System.out.println("Olá! Digite um número para ser lido: ");
		 int num = texto.nextInt();
		 quadrado = num*num;
		 System.out.println("O número elevado ao quadrado é: "+quadrado);
		 
		 texto.close();
	 }

}
