
package beecrowd_studies.solostudies;

import java.util.Scanner;

public class Prob009 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String[] splited = a.split(" ");

        for (int i = 0; i < splited.length; i++) {
            if (!splited[i].isEmpty()) { 
                splited[i] = splited[i].substring(0, 1).toUpperCase() + splited[i].substring(1).toLowerCase();
            }
        }

        String result = String.join(" ", splited);

        System.out.println(result);

        sc.close();
    }
}
