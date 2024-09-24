package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double porhour = 12.0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double combustivel = (x * y) / porhour;
		
		System.out.println(String.format("%.3f", combustivel));
		
		
		sc.close();

	}

}
