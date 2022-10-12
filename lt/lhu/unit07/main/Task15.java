package lt.lhu.unit07.main;

public class Task15 {

	public static void main(String[] args) {
		/**
		 * Дана последовательность действительных чисел a a an , , , 1 2  . Указать те
		 * ее элементы, которые принадлежат отрезку
		 * 
		 * [с, d].
		 */
		int[] mass = new int[] { -10, 0, 2, 3, 5, 8, 15, 22, 19, 2, 17, 25, 27, 33 };
		int C = mass[5];
		int D = mass[11];

		Task02.printArray(mass);

		System.out.println();
		System.out.println("Элементы принадлежащие заданному отрезку:");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] >= C & mass[i] <= D) {
				System.out.printf("[%d]", mass[i]);
			}
		}
	}
}
