package com.koreaIT.first.level2;

public class Array2Mission {
	public static void main(String[] args) {
		
		int[][] score = {
				{80,75,30,10},//수학
				{90,100,88,50,90},//영어
				{60,90,100,80},//국어
				{80,99,100}//물리
		};
		String[] subject = {"수학","영어","국어","물리"};
		
		//수학 합계 : , 평균 :
		//영어 합계 : , 평균 :
		//국어 합계 : , 평균 :
//		int sum = 0;
		
		int[] arraySum = new int[subject.length];
		double[] arrayAvg = new double[subject.length];
		
//		for(int j = 0; j < score.length; j++) {
//			for(int i = 0; i < score[j].length; i++) {
//				arraySum[j] += score[j][i];
//			}
//			arrayAvg[j] = (double)arraySum[j]/score[j].length;
//			
//			System.out.printf("%s 합계 : %d, 평균 : %s\n",subject[j],arraySum[j], arrayAvg[j]);
//			
//		}
		
		for(int j = 0; j < score.length; j++) {
			for(int i = 0; i < score[j].length; i++) {
				arraySum[j] += score[j][i];
				arrayAvg[j] += 1;
			}
//			arrayAvg[j] = (double)arraySum[j]/score.length;	
		}
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%s 합계 : %d, 평균 : %s\n",subject[i],arraySum[i], (double)arraySum[i]/arrayAvg[i]);
		}
		
		
	}
}
