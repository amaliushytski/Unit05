package lt.lhu.unit07.main;

public class Task20 {

	public static void main(String[] args) {
		/**
		 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из
		 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
		 * Примечание. Дополнительный массив не использовать.
		 */

		int x = 10;
		int[] mass = new int[x];

		Task01.arrayFillIn(mass);
		Task02.printArray(mass);

		for (int i = 1; i < mass.length; i = i + 2) {
			mass[i] = 0;
		}
		System.out.println();
		Task02.printArray(mass);
	}

}
