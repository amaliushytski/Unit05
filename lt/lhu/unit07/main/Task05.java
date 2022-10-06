package lt.lhu.unit07.main;

public class Task05 {

	public static void main(String[] args) {
		/**
		 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
		 * четных чисел этой последовательности. Если таких чисел нет, то вывести
		 * сообщение об этом факте.
		 */
		int x = 10;
		int[] mass = new int[x];

		int evenNumber = 0;

		Task01.arrayFillIn(mass);

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				evenNumber++;
			}
		}
		int[] evenNumberArray = new int[evenNumber];
		int index = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				evenNumberArray[index] = mass[i];
				index++;
			}
		}

		System.out.println("Сгенерирована последовательность чисел: ");
		Task02.printArray(mass);
		System.out.println();
		
		if (evenNumber > 0) {
			System.out.println("Найдены следующие четные числа:");
			Task02.printArray(evenNumberArray);
		} else {
			System.out.println("Четных чисел в последовательности не обнаружено");
		}
	}

}
