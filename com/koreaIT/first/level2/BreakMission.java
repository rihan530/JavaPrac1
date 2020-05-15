package com.koreaIT.first.level2;
import java.util.Scanner;

public class BreakMission {
	public static void main(String[] args) {
		/*
		 * 더할 숫자를 입력하세요(종료 0)10
		 * 더할 숫자를 입력하세요(종료 0)20
		 * 더할 숫자를 입력하세요(종료 0)30
		 * 더할 숫자를 입력하세요(종료 0)
		 * 현재까지의 총합 : 60
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
//		System.out.print("더할 숫자를 입력하세요.(종료 : 0)");
//		num = sc.nextInt();
//		
//		while(num!=0) {
////			if(num == 0) {
////				break;
////			}
//			
//			sum += num;
//			System.out.print("더할 숫자를 입력하세요.(종료 : 0)");
//			num = sc.nextInt();
//			
//		}
//		
//		System.out.println("현재까지의 총합 = " + sum);
		
		while(true) {
			System.out.print("더할 숫자를 입력하세요.(종료 : 0)");
			num = sc.nextInt();
			if(num==0) {
				System.out.println("현재까지의 총합 = " + sum);
				break;
			}
			sum += num;
		}
			
	}
}
