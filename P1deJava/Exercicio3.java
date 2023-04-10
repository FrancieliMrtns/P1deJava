package P1deJava;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Olá, digite eum número para sabermos sse é par ou impar: ");
		int num = texto.nextInt();
		int conta = num;
		
		if (num % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }
		
		texto.close();


		
	}

}
