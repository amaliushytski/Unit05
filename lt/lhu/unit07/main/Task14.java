package lt.lhu.unit07.main;

public class Task14 {

	public static void main(String[] args) {
		/**
		 * Дан одномерный массив A[N]. Найти:
		 * 
		 * max( , , , ) min( , , , ) a2 a4  a2k + a1 a3  a2k+1
		 */
		int x = 15;
		int[] mass = new int[x];
		int sum;

		Task01.arrayFillIn(mass);
		Task02.printArray(mass);

		System.out.println();
		System.out.println("Максимальное четное число в массиве:");
		System.out.println(maxEvenDefiner(mass));

		System.out.println();
		System.out.println("Минимальное не четное число в массиве:");
		System.out.println(minUnevenDefiner(mass));

		sum = maxEvenDefiner(mass) + minUnevenDefiner(mass);

		System.out.println();
		System.out.println("Сумма двух чисел равна:");
		System.out.println(sum);

	}

	public static int maxEvenDefiner(int[] x) {
		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				if (x[i] > max) {
					max = x[i];
				}
			}
		}
		return max;
	}

	public static int minUnevenDefiner(int[] x) {
		int min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				if (x[i] < min) {
					min = x[i];
				}
			}
		}
		return min;
	}

}
