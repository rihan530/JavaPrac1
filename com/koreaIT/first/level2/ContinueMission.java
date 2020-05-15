package com.koreaIT.first.level2;
import java.util.Scanner;

public class ContinueMission {
	public static void main(String[] args) {
//		현재 가진 돈은 10,000원 입니다.
//		얼마를 사용하시겠습니까? 1000
//		남은 돈은 9,000원 입니다.
//		
//		얼마를 사용하시겠습니까? 5000
//		남은 돈은 4,000원 입니다.
//		
//		얼마를 사용하시겠습니까? 5000
//		다시 입력해주세요 (사용 범위가 틀렸습니다.)
//		
//		얼마를 사용하시겠습니까? 4000
//		남은 돈은 0원 입니다.
//		
//		모든 돈 사용함. 종료
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		int remain = 10000;
		
		while(remain > 0) {
			
			System.out.print("얼마를 사용하시겠습니까? ");
			money = sc.nextInt();
			
			if(money > remain) {
				System.out.println("다시 입력해주세요. (사용 범위가 틀렸습니다)");
				continue;
			}
			remain -= money;
			System.out.printf("남은 돈은 %,d원 입니다.\n", remain);
		}
		System.out.println("모든 돈 사용함. 종료");
		sc.close();
	}
}
