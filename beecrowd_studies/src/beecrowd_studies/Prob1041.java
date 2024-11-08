package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		
		
		double y = 0.0;
		double x = 0.0;
		
		if(number1 > y && number2 > x) {
			System.out.println("Q1");
		}else if(number2 > y && number1 < x) {
			System.out.println("Q2");
		}else if(number1 < y && number2 < x) {
			System.out.println("Q3");
		}else if(number2 < y && number1 > x) {
			System.out.println("Q4");
		}else {
			System.out.println("Origem");
		}
		
		sc.close();
	}

}
