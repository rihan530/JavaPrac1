package com.koreaIT.first.level3;

public class MethodTest2 {
	public static void main(String[] args) {
		int rVal = getRandom(40, 50);
		int Val1 = getRandom(3, 55);
		int Val2 = getRandom(5, 20);
		System.out.println(rVal);
		System.out.println(Val1);
		System.out.println(Val2);
		
		int result = getABS(-910);
		System.out.println("result : " + result);
		
		int[] arr = {70, 44, 3, 8, 34, 98, 10};
		
		int min = getMin(arr);
		System.out.println("min : " + min);
		
		int max = getMax(arr);
		System.out.println("max : " + max);
		
		float div = getMaxMinDiv(arr);
		System.out.println("div : " + div);
	}
	public static float getMaxMinDiv(int[] arr) {
		float div;
		int min = getMin(arr);
		int max = getMax(arr);
		
		div = (float)max / min;
		return div;
	}
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i] ) {
				max = arr[i];
			} 
		}
		return max;
	}
	public static int getMin(int[] arr) {
		int min = arr[0] ;
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i] ) {
				min = arr[i];
			} 
		}
		return min;
	}
	public static int getABS(int i) {
//		if(i<0) {
//			i=(-i);
//		} 
//		return i;
		return i < 0 ? -i : i;
	}
	public static int getRandom(int i, int j) {
		int r = (int)(Math.random()*(j-i+1)+i);
		return r;
		
	}
}
