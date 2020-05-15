package com.koreaIT.first.level3;

public class Car { //사용자 정의 클래스
	//멤버 필드 - 속성
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	//멤버 메소드 - 동작
	void power() {
		powerOn = !powerOn;
	}
	
	void speedUp() {
		speed++;
	}
	
	void speedDown() {
		speed--;
	}
	
	void wiper() {
		wiperOn = !wiperOn;
	}
}
