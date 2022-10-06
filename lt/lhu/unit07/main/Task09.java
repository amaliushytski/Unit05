package lt.lhu.unit07.main;

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		/**
		 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
		 * наименьший элементы.
		 */
		int x = 10;
		int[] mass = new int[x];

		Task01.arrayFillIn(mass);
		Task02.printArray(mass);

		int min;
		int indexMin;
		indexMin = 0;
		min = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < min) {
				min = mass[i];
				indexMin = i;
			}
		}
		int max;
		int indexMax;
		indexMax = 0;
		max = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
				indexMax = i;
			}
		}
		int revers;
		revers = mass[indexMax];
		mass[indexMax] = mass[indexMin];
		mass[indexMin] = revers;
		System.out.println();
		Task02.printArray(mass);
	}

}
