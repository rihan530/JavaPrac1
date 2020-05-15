package com.koreaIT.first.level3;

public class MethodTest {
	public static void main(String[] args) {
		sum(1, 3, 4);
		/*
		sum(10, 20);
		sum(100, 120);
		multi(2, 3);
		
		int num1 = 10;
		int result = sum(num1, 20, 30, 40);
		System.out.println(result);
		
		int mi = minus(30, 20);
		System.out.printf("mi : %d\n", mi);
		String text1 = text("a","b");
		System.out.println(text1);
		System.out.println(text("a","b"));
		
		tplus("c", "d");
		*/
	}
	
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println(sum);
	}
	
	public static void sum(int n1, int n2, int n3) {
		System.out.println("int");
		int sum = n1 + n2 + n3;
		System.out.println(sum);
	}
	
	public static void sum(double n1, int n2, int n3) {
		System.out.println("double");
		double sum = n1 + n2 + n3;
		System.out.println(sum);
	}
	
	public static int sum(int n1, int n2, int n3, int n4) {
		return n1 + n2 + n3 + n4;
	}
	
	public static void multi(int n1, int n2) {
		int multi = n1 * n2;
		System.out.println(multi);
	}
	
	public static void tplus(String t1, String t2) {
		String tp = t1 + t2;
		System.out.println(tp);
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
		
	}
	
	public static String text(String t1, String t2) {
		return t1 + t2;
	}
	
}
