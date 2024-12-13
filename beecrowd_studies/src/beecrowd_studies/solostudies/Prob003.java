package beecrowd_studies.solostudies;

import java.util.Scanner;

public class Prob003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Número original: " + n);
        
        String numeroStr = String.valueOf(Math.abs(n)); 
        
        String numeroInvertidoStr = "";
        for (int i = numeroStr.length() - 1; i >= 0; i--) {
            numeroInvertidoStr += numeroStr.charAt(i);
        }

        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);

        if (n < 0) {
            numeroInvertido *= -1;
        }

        System.out.println("Número invertido: " + numeroInvertido);
        
        sc.close();
    }
}

