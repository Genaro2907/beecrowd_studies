package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		double pi = 3.14159;
		
		double volume = (4/3.0) * pi * r * r * r;
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
