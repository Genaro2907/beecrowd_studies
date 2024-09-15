package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double p1 = 3.5;
		double p2 = 7.5;
		
		double media = (n1 * p1 + n2 * p2) / (p1 + p2);
		
		System.out.printf("MEDIA = %.5f%n" , media);
		
		
		sc.close();

	}

}
