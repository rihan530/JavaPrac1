package com.koreaIT.first.level4;

public class Child extends Parent{
	
	public Child() {
		super();
		super.print();
	}
	
	public Child(int weight) {
		super(weight);
	}

	@Override
	public void print() {
		System.out.println("I'm Child.");
	}
	
	public void diff() {
		
	}

}
