package beecrowd_studies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Prob1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		
		List<Integer> Numeros = new ArrayList<>();
		
		Numeros.add(number1);
		Numeros.add(number2);
		Numeros.add(number3);
		
		Collections.sort(Numeros);
		
		for(int n1 : Numeros) {
			System.out.println(n1);
		}
		System.out.println();
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		
		
		sc.close();
	}

}
