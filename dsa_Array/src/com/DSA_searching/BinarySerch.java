package com.DSA_searching;

public class BinarySerch {

	public static int binarySerching(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
		int target = 12;

		int result = binarySerching(arr, target);

		if (result == -1) {
			System.out.println("The Element not found in the Array  ");
		} else {
			System.out.println("The Element foound at index :  " + result);
		}

	}

}
