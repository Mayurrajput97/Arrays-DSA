package com.DSA_searching;

public class LinearSearch {
	
	public static int linearSerching(int [] arr, int target) {
		
		for(int i = 0; i <= arr.length; i++) {
			
			if(arr[i] == target) {
				return i;
				
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int [] arr = {2,4,7,9,9,44,79};
		int target = 9;
		int index  = linearSerching(arr, target);
		System.out.println("The Element 9 Found At index : " + index);
		
	}

}
