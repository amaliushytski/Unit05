package lt.lhu.unit07.main;

public class Task11 {

	public static void main(String[] args) {
		/**
		 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
		 * от деления на М равен L (0 < L < М-1).
		 */
		int x = 10;
		int[] mass = new int[x];
		int M = 3;
		int L;

		Task01.arrayFillIn(mass);
		Task02.printArray(mass);

		System.out.println();
		System.out.println("Натуральные числа удовлетворяющие условию:");
		for (int i = 0; i < mass.length; i++) {
			L = mass[i] % M;
			if (L > 0 && (M - 1) > L) {

				System.out.printf("[%d]", mass[i]);

			}
		}

	}

}
