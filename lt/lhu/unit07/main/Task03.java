package lt.lhu.unit07.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		/**
		 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
		 * встречается раньше - положительное или отрицательное.
		 */
		int x = 21;
		int[] mas = new int[x];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
			if (mas[i] % 2 == 0) {
				mas[i] = mas[i] - 11;
			} else {
				mas[i] = mas[i];
			}
			System.out.println(mas[i]);
		}

		if (mas[0] > 0) {
			System.out.println("Первое число массива - положительное: " + mas[0]);
		} else {
			System.out.println("Первое число массива - отрицательное: " + mas[0]);
		}
	}

}
