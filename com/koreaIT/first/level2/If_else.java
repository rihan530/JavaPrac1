package com.koreaIT.first.level2;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인요금이 적용됩니다.");
		} else {
			System.out.println("청소년 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");
	}

}
