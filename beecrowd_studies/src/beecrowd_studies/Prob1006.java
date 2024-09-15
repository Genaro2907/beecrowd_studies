package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double p1 = 2;
		double p2 = 3;
		double p3 = 5;
		
		double media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
		
		System.out.printf("MEDIA = %.1f%n" , media);
		
		
		sc.close();

	}

}
