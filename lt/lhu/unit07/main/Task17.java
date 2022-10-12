package lt.lhu.unit07.main;

public class Task17 {

	public static void main(String[] args) {
		/**
		 * Дана последовательность целых чисел
		 * 
		 * a a an , , , 1 2  . Образовать новую последовательность, выбросив из
		 * исходной
		 * 
		 * те члены, которые равны
		 * 
		 * min( , , , ) a1 a2  an
		 */
		int x = 15;
		int[] mass = new int[x];
		int min;
		int count = 0;

		Task01.arrayFillIn(mass);
		System.out.println("Массив до преобразования\n");
		Task02.printArray(mass);

		min = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] < min) {
				min = mass[i];
			}
		}
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == min) {
				count++;
			}
		}
		int[] mass2 = new int[x - count];

		int index = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] != min) {
				mass2[index] = mass[i];
				index++;
			}
		}
		System.out.println();
		System.out.println("Массив после преобразования\n");
		Task02.printArray(mass2);
	}

}
