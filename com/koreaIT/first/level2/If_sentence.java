package com.koreaIT.first.level2;

import java.util.Scanner;

public class If_sentence {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 :");
		num = sc.nextInt();
		if(num>3) {
			System.out.println("입력한 숫자는 3보다 큽니다.");
		} else {
			System.out.println("입력한 숫자는 3보다 크지 않습니다.");
		}
		System.out.println("---END---");

	}

}
