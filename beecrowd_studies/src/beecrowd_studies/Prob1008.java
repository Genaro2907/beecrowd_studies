package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int id = sc.nextInt();
		int hour = sc.nextInt();
		double hourperday = sc.nextDouble();
		
		double salary = hourperday * hour;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n" , salary);
		
		sc.close();
		

	}

}
