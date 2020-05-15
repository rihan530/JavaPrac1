package com.koreaIT.first.level2;

import java.util.Scanner;

public class IfMission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String gender;
		String height;


		
		System.out.print("성별을 입력해 주세요 : (남 or 여) ");
		gender = sc.next();
		

		
		if( ! "남".equals(gender) || "여".equals(gender)) {
			System.out.println("올바른 값을 입력해 주세요.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
//		if(gender.contains("남")) {
//			
//		} else {
//			System.out.println("올바른 값을 입력해 주세요.");
//			System.out.println("프로그램을 종료합니다.");
//			System.exit(0);
//		}
			
		System.out.print("키를 입력해 주세요 : ");		
		height = sc.next();			
		
		for(char c : height.toCharArray()) {
			if(c >= 48 && c<= 57) {
				continue;
			} else {
				System.out.println("올바른 값을 입력해 주세요.");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
		int intHeight=Integer.parseInt(height);
		
		if("남".equals(gender)) {
			if(intHeight >= 170) {
				System.out.println("키가 크네요.");
			} else {
				System.out.println("키가 작네요.");
			}
		} else if("여".equals(gender)) {
			if(intHeight >= 160) {
				System.out.println("키가 크네요.");
			} else {
				System.out.println("키가 작네요.");
			}
		} else {
			System.out.println("올바른 값을 입력해 주세요.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
	}
}

