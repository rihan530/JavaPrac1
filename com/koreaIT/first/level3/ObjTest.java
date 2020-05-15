package com.koreaIT.first.level3;

public class ObjTest {
	public static void main(String[] args) {
		Car car = new Car(); //레퍼런스 변수에는 한개의 값만 저장됨 - 주소값
		car.color = "Green";
		car.color = "Red";
		
		Car car2 = new Car(); //객체를 생성할때마다 새로운 주소값 생성
		car2.color = "Coral";
		
		System.out.println(car);
		System.out.println(car2);
		Car car3 = car;
		car = car2;
		System.out.println(car);
		System.out.println(car2);
		car = car3;
		System.out.println(car);
		System.out.println(car2);
		
		System.out.println("car 색상 : " + car.color);
		System.out.println("car2 색상 : " + car2.color);
	}
}
