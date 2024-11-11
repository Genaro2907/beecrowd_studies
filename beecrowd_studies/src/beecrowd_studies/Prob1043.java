package beecrowd_studies;

import java.util.Locale;
import java.util.Scanner;

public class Prob1043 {

	public static void main(String[] args) {
		float A, B, C, areaTraphisium, perimeterTriangle ;
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {
			//Triangle perimeter = a + b + c;
			//Traphisium area is = (a + b)*h/2
			perimeterTriangle = A + B + C;
			System.out.printf("Perimetro = %.1f\n",perimeterTriangle);
		
			
		}else {
			areaTraphisium = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n",areaTraphisium);
			}
		sc.close();
	}

}
