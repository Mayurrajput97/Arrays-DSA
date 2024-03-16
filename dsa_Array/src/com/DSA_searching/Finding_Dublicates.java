package com.DSA_searching;

public class Finding_Dublicates {
	public static boolean findiDublicates(int []arr) {
		
		for(int i =0; i< arr.length; i++) {	
			for(int j = i +1 ; j <arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int [] arr = {2,4,6,6,7,4};
		
		System.out.println("The Array Has Dublicates? : "  + findiDublicates(arr));
	}

}
