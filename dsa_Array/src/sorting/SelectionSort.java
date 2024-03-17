package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSorting(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2, 5};
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		selectionSorting(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}

}
