package com.koreaIT.first.level2;

public class ForMission4 {
	
	public static void main(String[] args ) {
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("----%d단----\n", i);
			
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", j, i, i*j);
			}
			
			System.out.println("----------");
		}
	}
}
