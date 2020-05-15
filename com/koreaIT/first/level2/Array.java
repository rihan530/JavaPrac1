package com.koreaIT.first.level2;

public class Array {
	public static void main(String[] args) {
		
		String[] strArray = new String[10];
		int[] numArray = new int[100];
		int[] numArray2 = {1, 100, 200, 400};
		
		int[] numArray3 = new int[4];
		numArray3[0] = 1;
		numArray3[1] = 100;
		numArray3[2] = 200;
		numArray3[3] = 400;
		
		for(int i = 0; i < 100; i++) {
			numArray[i] = (i+1);
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println(numArray[i]);
		}
	}
}
