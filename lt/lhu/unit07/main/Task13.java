package lt.lhu.unit07.main;

public class Task13 {

	public static void main(String[] args) {
		/**
		 * Определить количество элементов последовательности натуральных чисел, кратных
		 * числу М и заключенных в промежутке от L до N.
		 */

		int[] mass = new int[] { -10, 0, 2, 3, 5, 8, 15, 22, 19, 4, 17, 25, 27, 33 };
		int L = 5;
		int N = 11;
		int M = 2;

		Task02.printArray(mass);

		System.out.println();
		System.out.println("Элементы принадлежащие заданному отрезку и кратные числу М:");
		for (int i = 0; i < mass.length; i++) {
			if (i >= L & i <= N) {
				if (mass[i] % M == 0)
					System.out.printf("[%d]", mass[i]);
			}
		}
	}

}
