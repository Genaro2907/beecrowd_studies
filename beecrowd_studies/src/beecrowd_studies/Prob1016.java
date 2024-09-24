package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int minutos = x * 2;
		
		System.out.println(minutos + " minutos");
		
		
		sc.close();

	}

}
