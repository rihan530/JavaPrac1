package com.koreaIT.first.level3;

public class ObjTest5 {
	public static void main(String[] args) {
		Random2 r = new Random2();
		r.num = 10;
		Random2.num = 20;
		int r1 = r.getRandom();
		System.out.println(r1);
		System.out.println(r.getRandom());
		
		int rVal = Random3.getRandom(21);
		System.out.println(rVal);
	}
}

class Random3 {
	public static int getRandom(int n1) {
		return (int)(Math.random()*n1);
	}
}

class Random2 {
	static int num;
	
	int getRandom() {
		return (int) (Math.random() * num);
	}
}