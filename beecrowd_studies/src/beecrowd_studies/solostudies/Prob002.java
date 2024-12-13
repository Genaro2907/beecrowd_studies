package beecrowd_studies.solostudies;

import java.util.Scanner;

public class Prob002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String nomes = sc.nextLine();

        nomes = nomes.trim().toLowerCase();
        char[] caracteres = nomes.toCharArray();

        String nomeInvertido = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            nomeInvertido += caracteres[i];
        }

        if (nomes.equals(nomeInvertido)) {
            System.out.println("A palavra \"" + nomes + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + nomes + "\" não é um palíndromo.");
        }

        System.out.println("Palavra invertida: " + nomeInvertido);
        sc.close();
    }
}

