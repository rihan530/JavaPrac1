package com.koreaIT.first.level2;

public class Break {

	public static void main(String[] args) {
		
		for(int z = 10; z < 20; z++) {
			for(int i = 0; i < 5; i++) {
				if(i == 3) {
					break;
				}
				System.out.printf("z:%d, i:%d\n", z, i);
			}
		}

	}

}
