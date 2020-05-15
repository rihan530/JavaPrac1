package com.koreaIT.first.level2;

public class For2 {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			
//			System.out.println(i + "단");
			System.out.printf("%d단\n", i);
			
			for(int z = 1; z < 10; z++) {
				
//				System.out.printf("i:%d, z:%d\n", i, z);
				System.out.printf("%d x %d = %d\n", i, z, i*z);
			}
			System.out.println();
		}
		
		
		

	}

}
