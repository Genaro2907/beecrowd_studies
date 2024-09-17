package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		double salaryfix = sc.nextDouble();
		double sale = sc.nextDouble();
		
		double bonus = (sale * 0.15) + salaryfix;
		
		System.out.printf(name);
		
		System.out.printf("TOTAL = R$ %.2f%n" , bonus);
		
		
		sc.close();

	}

}
