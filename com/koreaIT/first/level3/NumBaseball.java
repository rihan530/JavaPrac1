package com.koreaIT.first.level3;

import java.util.Scanner;

public class NumBaseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		int[] arr2 = new int[num];
		
		for(int j = 0; j < arr.length; j++) {
			arr[j] = (int)(Math.random()*9+1);
			for(int i = 0; i < j; i++) {
				if(arr[i]==arr[j]) {
					j--;
					break;
				} 
			}
		}
		
		end:
		while(true) {
			for(int i = 0; i < arr.length; i++) {
			System.out.printf("숫자%d 입력: (숫자 중복 금지)",i+1);
			int input = sc.nextInt();
			arr2[i] = input;
			}
			
			int bcnt = 0;
			int scnt = 0;
			int ocnt = 0;
			
			for(int z = 0; z < arr.length; z++) {
				for(int y = 0; y < arr2.length; y++) {
					if(arr2[y]==arr[z]) {
						if(y==z) {
							scnt++;
						} else {
							bcnt++;
						}
					}
				}
			}
		
			System.out.printf("스트라이크 : %d\n 볼 : %d\n 아웃 : %d\n", scnt, bcnt, num-(bcnt+scnt));
			
			if(scnt == num) {
				System.out.println("종료");
				break end;
			}
			
			bcnt = 0;
			scnt = 0;
		}
	}
}
