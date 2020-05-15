package com.koreaIT.first.level2;

public class ForMission2 {

	public static void main(String[] args) {
		int dan = 2;
		
		for(int i = 0; i < 9; i++) {
			System.out.println(dan + " * " + (i+1) + " = " + (dan*(i+1)));
		}
		
		System.out.println();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
		}
		
		System.out.println();
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}

	}

}
