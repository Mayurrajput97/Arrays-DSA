package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSorting(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 6, 1, 9, 4, 5, 3, 10 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		bubbleSorting(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));

	}

}
