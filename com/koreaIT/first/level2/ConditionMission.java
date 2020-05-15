package com.koreaIT.first.level2;
import java.util.ArrayList;
import java.util.Scanner;

public class ConditionMission {

	public static void main(String[] args) {
		int season;
		
		System.out.print("월을 입력해 주세요 : (1~12) ");
		Scanner sc = new Scanner(System.in);
		season = sc.nextInt();
		
		//switch문
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
		
		boolean spring = season>=3 && season<=5;
		boolean summer = season >= 6 && season <= 8;
		boolean autumn = season >= 9 && season <= 11;
		boolean winter = season >= 1 && season <= 2 || season == 12;
		
		//if문
		if(spring) {
			System.out.println("봄");
		} else if(summer) {
			System.out.println("여름");
		} else if(autumn) {
			System.out.println("가을");
		} else if(winter) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		if(season >= 3 && season <= 5) {
			System.out.println("봄");
		} else if(season >= 6 && season <= 8) {
			System.out.println("여름");
		} else if(season >= 9 && season <= 11) {
			System.out.println("가을");
		} else if(season >= 1 && season <= 2 || season == 12) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못 입력했습니다.");
			
		}
		
		if(season <= 0 || season >= 13) {
			System.out.println("잘못 입력했습니다.");
		} else if(season >= 3) {
			System.out.println("봄");
		} else if(season >= 6) {
			System.out.println("여름");
		} else if(season >= 9) {
			System.out.println("가을");
		} else if(season == 12 || season>=1) {
			System.out.println("겨울");
		}
		
//		int[] spring = {3, 4, 5};
//		int[] summer = {6, 7, 8};
//		int[] autumn = {9, 10, 11};
//		int[] winter = {12, 1, 2};
//		
//		for(int i=0;i<spring.length;i++) {
//			if(spring[i]==season) {
//				System.out.println("봄");
//			} else if(summer[i]==season) {
//				System.out.println("여름");
//			} else if(autumn[i]==season) {
//				System.out.println("가을");
//			} else if(winter[i]==season) {
//				System.out.println("겨울");
//			} else if(){
//
//			}
//		}
//						System.out.println("잘못 입력했습니다.");
	}

}
