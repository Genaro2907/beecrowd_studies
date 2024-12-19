
package beecrowd_studies.solostudies;

import java.util.Arrays;
import java.util.Scanner;

public class Prob008 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        a = a.replaceAll("[\\W_\\s]", "").toLowerCase();
        b = b.replaceAll("[\\W_\\s]", "").toLowerCase();

        char[] caracteresA = a.toCharArray();
        char[] caracteresB = b.toCharArray();

        Arrays.sort(caracteresA);
        Arrays.sort(caracteresB);

        boolean saoAnagramas = Arrays.equals(caracteresA, caracteresB);

        if (saoAnagramas) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
