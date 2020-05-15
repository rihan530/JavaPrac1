package com.koreaIT.first.level2;

public class ForMission8 {

	public static void main(String[] args) {
		int star = 5;
		int i;
		int j;
		
		
		
		
		for(i = star; i >= 1; i--) {
			for(j = 1; j<i; j++ ) {
				System.out.print(" ");
			}
			for(j = star; j>=i; j--) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 1; i <= star; i++) {
			for(j = star; j > 0; j--) {
				if(i<j) {
				System.out.print(" ");	
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(i = 0; i < star ; i++) {
			for(j = 1; j <= star ; j++) {
				if(j < star - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}


	}

}
