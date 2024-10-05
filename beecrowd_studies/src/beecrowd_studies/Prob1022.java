package beecrowd_studies;

import java.io.IOException;
import java.util.Scanner;

public class Prob1022 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int somaAB = a + b;
		int somaCD = c + d;
		int par = a % 2;
		
		
		if(b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && par == 0 ) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		
		
		sc.close();
	}

}
