package ordem;

import java.util.Scanner;

class Estatistica {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = getArrayDeInteiros(sc);
		System.out.println(estatisticaDeOrdem(array));
		sc.close();
	}

	private static int estatisticaDeOrdem(int[] array) {
		int IndexFirst = array[0];
		boolean achou = false;
		int i = 0;
		while (i < array.length && !achou) {

			int indexMin = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[indexMin]) {
					indexMin = j;
				}
			}
			swap(array, i, indexMin);

			if (IndexFirst == array[i]) {
				achou = true;
			}
			i++;
		}
		return i;
	}

	private static void swap(int[] array, int i, int j) {
		int aux = array[j];
		array[j] = array[i];
		array[i] = aux;
	}

	private static int[] getArrayDeInteiros(Scanner sc) {
		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(entrada[i]);
		}
		return array;

	}
}
