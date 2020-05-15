package com.koreaIT.first.level3;

public class ObjTest3 {
	public static void main(String[] args) {
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str);
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		
		Bucket b1 = new Bucket();
		b1.num = 10;
		b1.name = "LG";
		
		System.out.println(b1.num);
		System.out.println(b1.name);
		
		Bucket b2 = new Bucket();
		b2.num = 10;
		b2.name = "SAMSUNG";
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		
		b2.num = 20;

		System.out.println(b2.num);
		System.out.println(b2.name);
		System.out.println(b1.name);
	}
}


