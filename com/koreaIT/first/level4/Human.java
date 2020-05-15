package com.koreaIT.first.level4;

public class Human {
	private String name;
	private int age;
	public int a;
	
	public Human() {
//		System.out.println("기본생성자 호출");
//		this.name = "이순신";
//		this.age = 50;
		this("이순신", 50);
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Human(String name) {
		this(name, 25);
	}

	public Human(int age) {
		this("이순신",age);
	}

	public void printInfo() {
		System.out.printf(" 이름 : %s\n 나이 : %d\n", this.name, this.age);

	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}












