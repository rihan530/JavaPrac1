package com.koreaIT.method;

public class Method1 {
	public static void main(String[] args) {
		printTriStar(3);
		String stars = printTriStars(5);
		System.out.println(stars);
	}
	
	

	public static void printTriStar(int star) {
		
		int i;
		int j;
		
		for(i = 1; i <= star;i++ ) {
			
			for(j = 1; j <= i;j++ ) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	public static String printTriStars(int stars) {
		
		String star = "*";
		
		for(int i = 1; i <= stars; i++) {
			
			for(int j = 1; j <=i; j++) {
				star += star;
			}
			star += "\n";
		}
		
		return star;
	}
	
	
}
