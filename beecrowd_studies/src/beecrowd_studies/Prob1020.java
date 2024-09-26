package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int diaconvert = sc.nextInt();
		
		int ano = diaconvert / 365;
		int mes = (diaconvert % 365) / 30;
		int dia = (diaconvert % 365) % 30 ;
		
		System.out.println(ano + " ano(s)" );
		System.out.println(mes + " mes(es)" );		
		System.out.printf(dia + " dia(s)" );


		
		sc.close();

	}

}
