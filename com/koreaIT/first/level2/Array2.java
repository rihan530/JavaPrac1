package com.koreaIT.first.level2;

public class Array2 {
	public static void main(String[] args) {
		int[][] arr2 = new int[2][3];
		
		String[][] arr3 = {
						{"A","B","C"},
						{"D","E","F"}
						};
		
		arr2[0][2] = 10;
		
		System.out.println(arr2[0][2]);
		System.out.println(arr2[0].length);
		System.out.println(arr3[0].length);
	}
}
