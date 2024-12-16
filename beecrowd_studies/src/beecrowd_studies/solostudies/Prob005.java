
package beecrowd_studies.solostudies;

import java.util.Scanner;

public class Prob005 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.next();
    	
        StringBuilder resultado = new StringBuilder();
        int contador = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                contador++;
            } else {
                resultado.append(contador).append(input.charAt(i - 1));
                contador = 1; 
            }
        }

        resultado.append(contador).append(input.charAt(input.length() - 1));

        System.out.println("Resultado: " + resultado);
    	
    	sc.close();
    }
}

