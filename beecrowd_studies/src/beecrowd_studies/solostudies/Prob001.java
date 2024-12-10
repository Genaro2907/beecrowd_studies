package beecrowd_studies.solostudies;

import java.util.Scanner;

public class Prob001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes = sc.nextLine();
		char[] caracteres = nomes.toCharArray();
		
		String nomeInvertido = "";

		for(int i = caracteres.length - 1; i>= 0; i-- ) {
			nomeInvertido += caracteres[i];
		}
		
		System.out.println(nomeInvertido);
		sc.close();
	}

}
