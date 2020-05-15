package com.koreaIT.first.level3;

public class ArrayMission {
	public static void main(String[] args) {
		int[] arr = {20, 30, 40, 50, 80};
		int[] arr2 = {0, 0, 0, 0, 0};
		
		arr2 = arr.clone();
		arr.clone().equals(arr2);
		
		for(int i = 0; i < 5; i++) {
			arr2[i] = arr[i];
			
			System.out.print(arr);
			System.out.println(arr2);
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
		System.out.println();
		
		for(int val : arr2) {
			System.out.print(val + ", ");
		}
		System.out.println();
		System.out.println(arr == arr2);
	}
}
