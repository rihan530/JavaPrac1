package com.koreaIT.first.level2;
import java.util.Scanner;

public class ForMission6 {

	public static void main(String[] args) {
		int star;
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("갯수 입력 : ");
		star = sc.nextInt();
		
		for(i = 1; i <= star; i++) {
			for(j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 1, j = 1; i <= star ; ) {
			
			if(j <= star) {
			System.out.print("*");
			j++;
			} else {
				System.out.println();				
				i++;
				j = 1;

			}
		}
		
		for(i = 1; i <= star*star; i++) {
			System.out.print("*");
			if(i % star == 0) {
				System.out.println();
			}
		}

	}

}
