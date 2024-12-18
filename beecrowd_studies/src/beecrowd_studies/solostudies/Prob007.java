
package beecrowd_studies.solostudies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob007 {

	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int tamanho = 3; 

        List<int[]> subarrays = dividirEmSubarrays(array, tamanho);

        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }

    public static List<int[]> dividirEmSubarrays(int[] array, int tamanho) {
        List<int[]> resultado = new ArrayList<>();

        for (int i = 0; i < array.length; i += tamanho) {
            int fim = Math.min(array.length, i + tamanho);

            resultado.add(Arrays.copyOfRange(array, i, fim));
        }

        return resultado;
    }
}
