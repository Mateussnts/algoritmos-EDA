import java.util.Arrays;
import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = getArrayInteiros(scan);
		selectionSort(array);
		scan.close();
	}

	public static void selectionSort(int[] array) {
		int i, j, minIndex, temp;
		int n = array.length;

		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++)
				if (array[j] < array[minIndex])
					minIndex = j;
			if (minIndex != i) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
				System.out.println(Arrays.toString(array));
			}
		}
	}

	private static int[] getArrayInteiros(Scanner scan) {
		String[] entrada = scan.nextLine().split(" ");
		int[] array = new int[entrada.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(entrada[i]);
		}
		return array;
	}
}