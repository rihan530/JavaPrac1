package com.koreaIT.first.level3.don;

public class Tissue {
	private int num; // 전역변수
	int size;
	
	public void setNum(int num) {
		this.num = num; // 지역변수
	}

	public int getNum() {
		return num;
	}

	public void printNum() {
		System.out.println(num);
	}

	
}
