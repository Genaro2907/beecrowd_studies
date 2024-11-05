package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numberA = sc.nextDouble();
	
		if (numberA >=0 && numberA <= 25.0000) {
			System.out.printf("Intervalo [0,25]\n");
		}else if (numberA >= 25.00001 && numberA <= 50.0000000) {
			System.out.printf("Intervalo (25,50]\n");
		}else if (numberA >= 50.00001 && numberA <= 75.0000000) {
			System.out.printf("Intervalo (50,75]\n");
		}else if (numberA >= 75.00001 && numberA<=100.0000000) {
			System.out.printf("Intervalo (75,100]\n");
		}else {
			System.out.print("Fora de intervalo\n");
		}
		sc.close();

	}

}
