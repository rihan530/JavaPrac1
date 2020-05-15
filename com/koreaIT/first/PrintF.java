package com.koreaIT.first;

public class PrintF {

	public static void main(String[] args) {
		int age = 20;
		String name = "한병철";
		double height = 170.5;
		
		String str = "안녕하세요 " + name + "입니다.\n" + "제 나이는 " + age + "입니다.\n" + "제 키는 " + height + "cm입니다.\n";
		System.out.println(str);
		
		System.out.printf("안녕하세요 %s입니다. 제 나이는 %,07d입니다. 제 키는 %.1fcm입니다.\n", name, age, height);

	}

}
