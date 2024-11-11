package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1044 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if (number1 % number2 == 0 || number2 % number1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
		sc.close();
	}

}
