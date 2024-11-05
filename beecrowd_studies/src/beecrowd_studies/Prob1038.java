package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		switch (cod) {
		case 1: {
			double sum = qtd * 4.00;
			System.out.println("Total: R$ " + String.format("%.2f", sum));
			break;
		}
		case 2: {
			double sum = qtd * 4.50;
			System.out.println("Total: R$ " + String.format("%.2f", sum));
			break;
		}
		case 3: {
			double sum = qtd * 5.00;
			System.out.println("Total: R$ " + String.format("%.2f", sum));
			break;
		}
		case 4: {
			double sum = qtd * 2.00;
			System.out.println("Total: R$ " + String.format("%.2f", sum));
			break;
		}
		case 5: {
			double sum = qtd * 1.50;
			System.out.println("Total: R$ " + String.format("%.2f", sum));
			break;
		}
		default:
			sc.close();
		}
		

	}

}
