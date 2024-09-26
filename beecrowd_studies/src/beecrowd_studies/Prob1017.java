package beecrowd_studies;

import java.io.IOException;
import java.util.Scanner;

public class Prob1017 {

	public static void main(String[] args) throws IOException {
		 
		Scanner sc = new Scanner(System.in);
		int N, horas, minutos, segundos;

		N = sc.nextInt();

		horas = N / 3600;
		minutos = (N % 3600) / 60;
		segundos = (N % 3600) % 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();

    }

}
