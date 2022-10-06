package lt.lhu.unit07.main;

public class Task07 {

	public static void main(String[] args) {
		/**
		 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее
		 * члены, большие данного Z, этим числом. Подсчитать количество замен.
		 */
		int x = 10;
		int[] mass = new int[x];
		int limit = 450;
		int count = 0;

		Task01.arrayFillIn(mass);
		System.out.println("Изначальный массив: ");
		Task02.printArray(mass);

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > limit) {
				mass[i] = limit;
			}
		}
		System.out.println();
		System.out.println("Массив после замены: ");
		Task02.printArray(mass);

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == limit) {
				count++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Колличество замен равно: " + count);
	}

}
