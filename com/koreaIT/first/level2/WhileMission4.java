package com.koreaIT.first.level2;
import java.util.Scanner;

public class WhileMission4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String response = "Y";
		int check = 1;
		
		while(true) {
		
			System.out.print("음악을 재생하시겠습니까? (Y,N)");
			response = sc.next();	
		
			if(!response.equals("Y")) {
				
				System.out.println("재생 종료");
				break;
			}
			
			System.out.printf("음악을 %d번 재생했습니다.\n", check);
			check++;
			
		}
	}
}
