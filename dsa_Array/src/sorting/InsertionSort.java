package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSorting (int []arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			int j = i;
			
			while(j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int [] arr = { 4,2,8,3,7,5,9,1};
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		insertionSorting(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}

}
