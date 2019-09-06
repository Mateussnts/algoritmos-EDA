package particiona;

import java.util.Arrays;
import java.util.Scanner;

class ParticionaLomuto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = getArrayInteiros(sc);
		particionamentoLomuto(array);
		System.out.println(Arrays.toString(array));
		sc.close();

	}

	private static void particionamentoLomuto(int[] array) {
		int pivot = array[0];
		int i = 0;
		for (int j = 1; j < array.length; j++) {
			if (array[j] < pivot) {
				i++;
				int aux = array[j];
				array[j] = array[i];
				array[i] = aux;
				System.out.println(Arrays.toString(array));
			}
		}
		
		int aux = array[0];
		array[0] = array[i];
		array[i] = aux;
		System.out.println(Arrays.toString(array));
	}

	private static int[] getArrayInteiros(Scanner sc) {
		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(entrada[i]);
		}
		return array;
	}
}
