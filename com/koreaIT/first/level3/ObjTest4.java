package com.koreaIT.first.level3;

public class ObjTest4 {
	public static void main(String[] args) {
		Bucket.name = "Bucket";
		System.out.println("Bucket.name : " + Bucket.name);
		
		Bucket b = new Bucket();
		System.out.println("b.name : " + b.name);
	}
}
