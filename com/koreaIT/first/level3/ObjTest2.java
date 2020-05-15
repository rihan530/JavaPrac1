package com.koreaIT.first.level3;

public class ObjTest2 {
	public static void main(String[] args) {
		int mainWheel = 4;
		
		System.out.println(mainWheel);
		changeWheel(mainWheel);
		System.out.println(mainWheel);
		
		Car car = new Car();
		car.wheel = 8;
		System.out.println(car.wheel);
		changeWheel(car);
		System.out.println(car.wheel);
	}
	
	public static void changeWheel(int mainWheel) {
		mainWheel = 10;
	}
	
	public static void changeWheel(Car car) {
		car.wheel = 10;
	}
}
