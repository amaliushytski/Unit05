package lt.lhu.unit07.main;

public class Task04 {

	public static void main(String[] args) {
		/**
		 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет
		 * ли она возрастающей.
		 */
		int x = 10;
		int[] mass = new int[x];

		Task01.arrayFillIn(mass);
		Task02.printArray(mass);

		System.out.println();

		if (mass[0] < mass[1]) {
			System.out.println("Последовательность возрастающая");
		} else {
			System.out.println("Последовательность убывающая");
		}

	}

}
