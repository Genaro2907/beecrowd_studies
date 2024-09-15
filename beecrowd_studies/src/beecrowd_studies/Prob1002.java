package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		 double n = sc.nextDouble();
		 double pi = 3.14159;
		 
		 double a = pi * n * n;
		 
		 System.out.printf("A=%.4f%n", a );
		
		sc.close();

	}

}
