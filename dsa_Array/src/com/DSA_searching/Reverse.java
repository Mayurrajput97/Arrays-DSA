package com.DSA_searching;

import java.util.Arrays;

public class Reverse {
	public static void reversing(int [] arr) {
		int i = 0;
		int j = arr.length -1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10};
		System.out.println("Array Before : " + Arrays.toString(arr));
		reversing(arr);
		System.out.println("Array After : "  + Arrays.toString(arr));
	}

}
