package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numberA = sc.nextDouble();
		double numberB = sc.nextDouble();
		double numberC = sc.nextDouble();

		double delta = Math.pow(numberB, 2) - 4 * numberA * numberC;

		if (delta < 0.0 || numberA == 0.0 || numberB == 0.0 || numberC == 0.0) {
			System.out.println("Impossivel calcular");
		} else {

			double x1 = (-numberB + Math.sqrt(delta)) / (2 * numberA);
			double x2 = (-numberB - Math.sqrt(delta)) / (2 * numberA);
			System.out.println("R1 = " + String.format("%.5f", x1));
			System.out.println("R2 = " + String.format("%.5f", x2));

		}

		sc.close();

	}

}
