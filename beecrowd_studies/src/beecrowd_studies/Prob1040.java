package beecrowd_studies;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Prob1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double number3 = sc.nextDouble();
		double number4 = sc.nextDouble();
		
		
		double media = ((number1*2) + (number2*3) + (number3*4) + (number4*1)) / 10;
		System.out.println("Media: " + df.format(media));
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}else if (media < 7.0 && media >= 5.0 ) {
			System.out.println("Aluno em exame.");
			double exame = sc.nextDouble();
			System.out.println("Nota do exame: " + exame);
			media = (media + exame) / 2;
			if(media >= 5.0) {
				
				System.out.println("Aluno aprovado.");
				
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + String.format("%.1f", media));
			
		}else{
			System.out.println("Aluno reprovado.");
		}
		
		
		sc.close();
	}

}
