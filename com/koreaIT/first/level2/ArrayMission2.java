package com.koreaIT.first.level2;

public class ArrayMission2 {
	public static void main(String[] args) {
		int[] mainScore = {100, 88, 23, 88, 90};
		
		int sum = 0;
		double avg;
		
		for(int i = 0; i < mainScore.length; i++) {
			sum += mainScore[i];
		}
		
		avg = (double)sum / mainScore.length;
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %s\n", avg);
		
	}
}
