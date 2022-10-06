package lt.lhu.unit07.main;

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		/**
		 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		 * порядковые номера которых являются простыми числами.
		 */
		int x = 10;
		double[] mass = new double[x];
		double sum = 0;

		Random rand = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = rand.nextInt(1000);
		}

		for (int i = 0; i < mass.length; i++) {
			System.out.printf("[%4.2f]", mass[i]);
		}

		for (int i = 0; i < mass.length; i++) {
			if (isPrime(i)) {
				sum = sum + mass[i];
			}
		}
		System.out.println();
		System.out.println("Сумма чисел: " + sum);
	}

	public static boolean isPrime(int x) {
		if (x < 0) {
			return false;
		}
		for (int i = 2; i <= x; i++) {
			if (x % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
