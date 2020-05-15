package com.koreaIT.first.level2;

public class ForMission7 {

	public static void main(String[] args) {
		int star = 5;
		int i;
		int j;
		
		for(i = 1; i <= star;i++ ) {
//			
			for(j = 1; j <= i;j++ ) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for(i = 1,j = 1; i <= star; ) {
			
			if(j<=i) {
				System.out.print("*");
				j++;
			} else {
				System.out.println();
				i++;
				j=1;
			}
		}

	}

}
