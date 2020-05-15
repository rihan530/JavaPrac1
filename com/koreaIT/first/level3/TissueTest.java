package com.koreaIT.first.level3;

import com.koreaIT.first.level3.don.Tissue;

public class TissueTest {
	public static void main(String[] args) {
		Tissue tt = new Tissue();
		tt.setNum(10);
		System.out.println(tt.getNum());
		tt.printNum();
//		tt.size = 10;
	}
}
