package lt.lhu.unit07.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		/**
		 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
		 * в нем отрицательных, положительных и нулевых элементов.
		 */

		int N = 210;
		int[] mass = new int[N];

		arrayFillInByRandomPosAndNegValues(mass);

		Task02.printArray(mass);

		System.out.println();
		System.out.println("Число положительных элементов в массиве: " + findCountOfPositiveValuesInArray(mass));

		System.out.println();
		System.out.println("Число отрицательных элементов в массиве: " + findCountOfNegativeValuesInArray(mass));

		System.out.println();
		System.out.println("Число элементов в массиве равных нулю: " + findCountOfZeroValuesInArray(mass));
	}

	public static void arrayFillInByRandomPosAndNegValues(int[] x) {
		Random rand = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextInt(20);
			if (x[i] % 2 == 0) {
				x[i] = x[i] - 11;
			} else {
				x[i] = x[i];
			}
		}

	}

	public static int findCountOfPositiveValuesInArray(int[] x) {
		{
			int positiveCount = 0;
			for (int i = 0; i < x.length; i++) {
				if (x[i] > 0) {
					positiveCount++;
				}
			}
			return positiveCount;
		}
	}

	public static int findCountOfNegativeValuesInArray(int[] x) {
		{
			int negativeCount = 0;
			for (int i = 0; i < x.length; i++) {
				if (x[i] < 0) {
					negativeCount++;
				}
			}
			return negativeCount;
		}
	}

	public static int findCountOfZeroValuesInArray(int[] x) {
		{
			int zeroCount = 0;
			for (int i = 0; i < x.length; i++) {
				if (x[i] == 0) {
					zeroCount++;
				}
			}
			return zeroCount;
		}

	}

}
