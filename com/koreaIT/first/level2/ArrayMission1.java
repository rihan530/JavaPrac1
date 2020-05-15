package com.koreaIT.first.level2;

public class ArrayMission1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		
		int arrCnt = 0;
//		1~100 사이 값 중에 짝수만 arr에 순차적으로 넣기
		
		
		
		for(int i = 0; i < arr.length; i++) {
//			if((i)%2==0)
				arr[i] = (i+1)*2;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
