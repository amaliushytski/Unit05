package lt.lhu.unit07.main;

public class Task10 {

	public static void main(String[] args) {
		/**
		 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		 * которых аi > i.
		 */
		int x = 10;
		int[] mass = new int[x];
		int k = 400;

		Task01.arrayFillIn(mass);
		Task02.printArray(mass);
		System.out.println();
		System.out.println("Числа для которых аi > i:");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > k) {
				System.out.println();
				System.out.printf("[%d]", mass[i]);
			}
		}

	}

}
