package com.DSA_searching;

public class Min_Max {
	
	public static void minMaxOPeration(int [] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i =1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			else if(arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.println("The maximum Element is : " + max);
		System.out.println("The minimum Element is : " + min);

	}

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10,12,53,1,3,7};
		minMaxOPeration(arr);
	}

}
