package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		int qtd = sc.nextInt();
		double valor = sc.nextDouble();
		
		
		int id2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double soma = (qtd * valor) + (qtd2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n" , soma , id , id2);
		
		
		
		
		
		
		sc.close();

	}

}
