package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int numeroMaior = (a + b + Math.abs(a - b)) / 2;
		
		if(numeroMaior > c) {
			System.out.printf(numeroMaior + " eh o maior");
			
		}else {
			System.out.printf(c + " eh o maior");
		}
		
		
		
		sc.close();

	}

}
