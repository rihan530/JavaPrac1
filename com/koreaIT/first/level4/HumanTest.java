package com.koreaIT.first.level4;

public class HumanTest {

	public static void main(String[] args) {
//		Human h1 = new Human("홍길동",25);
		Human h1 = new Human();
//		h1.printInfo();
//		Human h2 = new Human("홍길동", 25);
//		h2.printInfo();
//		Human h3 = new Human("길동");
//		h3.printInfo();
//		Human h4 = new Human(34);
//		h4.printInfo();
		
		String name = h1.getName();
		int age = h1.getAge();
		
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
		
		Human h5 = new Human();
//		String name = h5.getName();
//		int age = h5.getAge();
		h5.setName("홍길동");
		h5.setAge(30);
		
		System.out.printf("이름 : %s, 나이 : %d\n", h5.getName(), h5.getAge());
		
//		h5.printInfo();
		
		
		
//		System.out.println("Human");
		
	}
}
