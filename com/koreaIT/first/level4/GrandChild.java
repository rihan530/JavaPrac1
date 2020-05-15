package com.koreaIT.first.level4;

public class GrandChild extends Child {
	
	public GrandChild() {
		super();
		super.print();
	}
	
	public GrandChild(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("I'm GrandChild.");
	}
}
