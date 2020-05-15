package com.koreaIT.first.level2;
import java.util.Arrays;

public class ArrayMission3 {
	public static void main(String[] args) {
		int[] arr = {30, 70, 100, 10, 110, 9, 11, 5};
		
		int[] sort = new int[arr.length];
		
		int min = arr[0];
		int max = arr[0];
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(min > arr[i] ) {
				min = arr[i];
			} 
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.printf("min : %d\n",min);
		System.out.printf("max : %d\n",max);
		
		for(int i = 0,j;i < arr.length; i++) {
			for(j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					
				}
				System.out.printf("%d %d \n",arr[i], arr[j]);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			Arrays.sort(arr);
//			System.out.printf("%d ",arr[i]);
//		}
	}
}
