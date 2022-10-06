package lt.lhu.unit07.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		/**
		 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
		 * кратны данному К.
		 */
		int N = 1000;
		int K = 3;
		int sum = 0;
		int[] A;
		A = new int[N];

		arrayFillIn(A);

		for (int i = 0; i < A.length; i++) {
			if (i % K == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Сумма элементов массива А кратных числу К равна: " + sum);
	}

	public static void arrayFillIn(int[] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}

	}
}
