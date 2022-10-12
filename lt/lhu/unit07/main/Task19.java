package lt.lhu.unit07.main;

public class Task19 {

	public static void main(String[] args) {
		/**
		 * В массиве целых чисел с количеством элементов n найти наиболее часто
		 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
		 * них.
		 */

		int[] mass = new int[] { 33, 83, 33, 33, 2, 75, 65, 97, 2 };
		int count = 0;
		Task02.printArray(mass);

		System.out.println();

		int[] mass2 = new int[10];
//Наполняем новый массив mass2 массив повторящимися числами
		for (int i = 0; i < mass.length; i++) {
			for (int j = i + 1; j < mass.length; j++) {
				if (mass[i] == mass[j] & mass[i] != 0) {
					mass2[i] = mass[i];
				}

			}

		}
//Находим число записей не равных нулю
		for (int i = 0; i < mass2.length; i++) {
			if (mass2[i] != 0)
				count++;
		}
//Создаем новый массив и заполняем его данными без нулей
		int[] mass3 = new int[count];
		for (int i = 0, j = 0; i < mass2.length; i++) {
			if (mass2[i] != 0) {
				mass3[j] = mass2[i];
				j++;
			}
		}
//Выводим все наиболее часто встречающиеся числа
		System.out.println();
		System.out.printf("Наиболее часто встречающиеся числа в массиве:");
		for (int i = 0; i < mass2.length; i++) {
			if (mass2[i] > 0) {
				System.out.println();
				System.out.printf("[%d]", mass2[i]);
			}
		}
//Сортируем массив по возрастанию
		findMinBySort(mass3);

//Выводим первое число из отсортированного массива
		System.out.println();
		System.out.println("Наименьшее из наиболее часто встречающихся чисел: " + mass3[0]);

	}

	public static void findMinBySort(int[] x) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;

			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					sorted = false;

				}
			}
		}

	}

}
