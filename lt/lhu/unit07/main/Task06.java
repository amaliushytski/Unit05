package lt.lhu.unit07.main;

public class Task06 {

	public static void main(String[] args) {
		/**
		 * Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
		 * числовой оси, содержащую все эти числа.
		 */
		int x = 10;
		int[] mass = new int[x];
		int min;
		int max;
		int minimumLength;

		Task01.arrayFillIn(mass);
		Task02.printArray(mass);

		minimumLength = findMax(mass) - findMin(mass);
		System.out.println();
		System.out.println("Наименьшая длина числовой оси равна: " + minimumLength);
	}

	public static int findMin(int[] x) {
		int min = x[0];
		for (int i = 0; i < x.length; i++) {

			if (x[i] < min) {
				min = x[i];

			}
		}
		return min;
	}

	public static int findMax(int[] x) {
		int max = x[0];
		for (int i = 0; i < x.length; i++) {

			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

}
