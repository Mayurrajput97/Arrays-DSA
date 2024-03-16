package com.DSA_searching;

public class SortedORnot {
	public static boolean sortedOrNot(int [] arr) {
		
		for(int i = 0; i< arr.length -1; i++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int [] arr = {2,4,1,8,10};
//		int [] arr1 = {3,6,2,7,3,8};
		
		boolean result = sortedOrNot(arr);
		
		if(result == true) {
			System.out.println("The Array is Sorted ");
		}else {
			System.out.println("The Array is not Sorted ");
		}
	}
}
