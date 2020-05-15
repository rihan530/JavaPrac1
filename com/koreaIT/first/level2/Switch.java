package com.koreaIT.first.level2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int book;
		
		System.out.print("읽은 책 권수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		book = sc.nextInt();
		book = book / 10;
		
		switch(book) {
		case 1:
			System.out.println("10권 이상 20권 미만");
			break;
		case 2:
			System.out.println("20권 이상 30권 미만");
			break;
		case 3:
			System.out.println("30권 이상 40권 미만");
			break;
		case 4:
			System.out.println("40권 이상 50권 미만");
			break;
		default:
			System.out.println("50권 이상");
		}

	}

}
