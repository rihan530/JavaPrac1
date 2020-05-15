package com.koreaIT.first.level2;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		double d = Math.random();
		
		int r = (int)(Math.random()*101+200);//200~300
		
		int r1 = (int)(Math.random()*20+11);//11~30
		
//		System.out.println(r);
		
//		System.out.println(r1);
		
		int[] arr = new int[3];
		
		for(int j = 0; j < arr.length; j++) {
			arr[j] = (int)(Math.random()*9+1);
			for(int i = 0; i < j; i++) {
				if(arr[i]==arr[j]) {
					j--;
					break;
				} 
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[3];
		int i = 0;
		parent:
			while(i < arr2.length) {
				arr2[i] = (int)(Math.random()*9 +1);
				for(int j = 0; j < i; j++) {
					if(arr2[i] == arr2[j]) {
						continue parent;
					}
				}
				i++;
			}
		
		
		
		Random rand = new Random();
		int rand1 = rand.nextInt(9)+1;
		System.out.println(rand1);
		
	}
	
	
	
	
}
