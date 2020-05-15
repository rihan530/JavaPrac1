package com.koreaIT.first;

public class PrintF2 {

	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.printf("%c : %d\n", ch, (int)ch);
		
		int in = 66;
		System.out.printf("%c : %d\n", (char)in, in);
		
		String str1 = "SUM은 " + 2 + 2;
		System.out.println(str1);
		
		String str2 = 2 + 2 + " SUM은";
		System.out.println(str2);
	}
}
