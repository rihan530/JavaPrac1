package com.koreaIT.first.level3;

public class MethodTest4 {
	public static void main(String[] args) {
		printStarLine(5);
		System.out.println();
		System.out.println();
		printSquare(5);
		printTriangle(10);
		printReverseTriangle(5);
		printPyramid(5);
	}

	public static void printStarLine(int star) {
		for(int i = 0; i < star; i++) {
			System.out.print("*");
			
		}
		
	}

	public static void printSquare(int ss) {
		for(int i = 0; i < ss; i++) {
			printStarLine(ss);
			System.out.println();
		}
		
	}
	
	public static void printTriangle(int st) {
		for(int i = 0; i <= st; i++) {
			printStarLine(i);
			System.out.println();
		}
	}
	
	public static void printReverseTriangle(int rs) {
		for(int i = rs; i > 0; i--) {
			printStarLine(i);
			System.out.println();
		}
	}
	
	public static void printPyramid(int sp) {
		for(int z = 0; z < sp; z++) {
			for(int i = 1; i < sp-z; i++) {
				System.out.print(" ");
			}
			for(int j = 0; j < z*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
