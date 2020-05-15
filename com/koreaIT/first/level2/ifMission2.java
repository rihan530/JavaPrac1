package com.koreaIT.first.level2;

import java.util.Scanner;

public class ifMission2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String gender;
		int height;


		
		System.out.print("성별을 입력해 주세요 : (남 or 여) ");
		gender = sc.next();
		
		System.out.print("키를 입력해 주세요 : ");		
		height = sc.nextInt();
		int standHeight = 0;
		
		
		
		if(gender.equals("남") || gender.equals("남자") ||gender.equals("man") ) {
			standHeight = 170;
		} else if("여자".equals(gender)) {
			standHeight = 160;
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		if(standHeight == 0) {
			System.out.println("잘못 입력했습니다.");
		} else {
			if(height >= standHeight) {
				System.out.println("키가 크네요.");
			} else {
				System.out.println("키가 작네요.");
			}
		}

	}

}
