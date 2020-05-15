package com.koreaIT.first.level2;

import java.util.Scanner;

public class TestMission {

	public static void main(String[] args) {
		/*
		자판기
		1. 콜라 - 500원
		2. 사이다 - 600원
		3. 환타 - 500원
		4. 맥콜 - 600원
		5. 마운틴듀 - 700원
		6. 수염차 - 1,000원
		
		음료를 선택해주세요(종료 : 0)1
		콜라 - 500원
		음료를 선택해주세요(종료 : 0)6
		수염차 - 1,000원
		음료를 선택해주세요(종료 : 0)8
		잘못 선택했습니다
		음료를 선택해주세요(종료 : 0)0
		종료!
		*/
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		String[] productName = {"콜라","사이다","환타","맥콜","마운틴듀","수염차"};
		int[] price = {500,600,500,600,700,1000};
		String[] vendingMachine = {	"------자판기------",
									"1. 콜라 - 500원",
									"2. 사이다 - 600원",
									"3. 환타 - 500원",
									"4. 맥콜 - 600원",
									"5. 마운틴듀 - 700원",
									"6. 수염차 - 1,000원",
									"-----------------"};
		
//		System.out.println("자판기");
//		System.out.println("1. 콜라 - 500원");
//		System.out.println("2. 사이다 - 600원");
//		System.out.println("3. 환타 - 500원");
//		System.out.println("4. 맥콜 - 600원");
//		System.out.println("5. 마운틴듀 - 700원");
//		System.out.println("6. 수염차 - 1,000원");
//		System.out.println("------------------");
		
		System.out.println("자판기");
		
		for(int i = 0; i < productName.length; i++) {
			System.out.printf("%d. %s - %,d원\n",i+1, productName[i], price[i]);
		}
		
		System.out.println("------------------");
		
		for(int i = 0; i < vendingMachine.length; i++) {
			System.out.println(vendingMachine[i]);
		}
		
		while(true) {
			System.out.print("음료를 선택해주세요(종료 : 0)");
			choice = sc.nextInt();
			if(choice==0) {
				System.out.println("종료");
				break;
			}else if(choice >productName.length || choice < 0) {
				System.out.println("잘못 선택했습니다");
				continue;
			}
			System.out.printf("%s - %,d원\n",productName[choice-1], price[choice-1]);
		}
		
		
		
		
		
//		do {
//			System.out.print("음료를 선택해주세요(종료 : 0)");
//			choice = sc.nextInt();
//			if(choice==0) {
//				System.out.println("종료");
//				break;
//			} else if(choice >productName.length || choice < 0) {
//				System.out.println("잘못 선택했습니다");
//				continue;
//			}
//			System.out.printf("%s - %,d원\n",productName[choice-1], price[choice-1]);
//		}while(choice != 0);
//	sc.close();	
//	}
	
	}
}












