package lt.lhu.unit07.main;

public class Task02 {

	public static void main(String[] args) {
		/**
		 * В целочисленной последовательности есть нулевые элементы. Создать массив из
		 * номеров этих элементов.
		 */
		int[] ar1 = new int[] { 24, 83, 72, 33, 0, 75, 67, 97, 0 };

		int zeroNumbers = 0;

		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == 0) {
				zeroNumbers++;
			}
		}

		int[] zeroArray = new int[zeroNumbers];
		for (int i = 0, j = 0; i < ar1.length; i++) {
			if (ar1[i] == 0) {
				zeroArray[j++] = i;
			}
		}
		printArray(ar1);
		System.out.println();
		printArray(zeroArray);
	}

	public static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.printf("[%d]", x[i]);
		}
	}
}
