package com.koreaIT.first.level3;

public class ArrayMission2 {
	public static void main(String[] args) {
		int[] arr, arr2;
		
		arr = setArrDefaultValue(5, 3);
		
		arr2 = setArrDefaultValue(8, 1);
		
		arrView(arr);
		arrView(arr2);
	}

	public static int[] setArrDefaultValue(int len, int i) {
		int[] temp = new int[len];
		for(int j = 0; j < len; j++) {
//			arr[j] = i;
			temp[j] = i;
		}
		return temp;
	}
	
	public static void arrView(int[] arr) {
		System.out.println("Print Array Hashcode : " + arr.hashCode());
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]", arr[i]);
			System.out.println(arr);
		}
		System.out.println();
	}
}
