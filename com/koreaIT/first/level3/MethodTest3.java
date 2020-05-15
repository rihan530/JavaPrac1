package com.koreaIT.first.level3;

public class MethodTest3 {
	public static void main(String[] args) {
		int dan = 4;
		printGugudan(dan);
		
		int sDan = 5;
		int eDan = 9;
		
//		sDan = 8;
//		eDan = 2;
		printGugudan2(sDan, eDan);
		printGugudan3(sDan, eDan);
	}

	public static void printGugudan(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		return;
	}
	
	public static void printGugudan2(int sDan, int eDan) {
		if(sDan > eDan) {	
			for(int j = sDan; j >= eDan; j--) {
				printGugudan(j);
				System.out.println();
			}
		} else {
			for(int j = sDan; j <= eDan; j++) {
				printGugudan(j);
				System.out.println();
			}
		}
	}
	
	public static void printGugudan3(int sDan, int eDan) {
		int dan = sDan;
		int endCnt = (sDan > eDan) ? (sDan - eDan) : (eDan - sDan);
		
		for(int i = 0; i <= endCnt; i++) {
			printGugudan(dan);
			dan = sDan > eDan ? dan - 1 : dan + 1;
			System.out.println();
		}
	}
	
}
