package com.koreaIT.first.level2;

public class SortMission {
	public static void main(String[] args) {
		int[] arr = {30, 29, 30, 100, 10, 130, 9, 11, 10, 1};
		int temp = 0;
		
		for(int i = 0,j;i < arr.length; i++) {
			for(j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
						
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 0) {
				System.out.print(",");
			}
			System.out.printf("%d", arr[i]);
			
		}
		
		
		
	}
}
