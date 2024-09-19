package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		double litro = sc.nextDouble();
		
		double distancia = km / litro ;
		
		System.out.printf(String.format("%.3f",distancia) + " km/l");
		
		
		
		
		sc.close();

	}

}
