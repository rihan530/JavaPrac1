package com.koreaIT.first.level4;

public class Parent extends Object{
	
	private int weight;
	
	public Parent() {
		super();
	}
	
	public Parent(int weight) {
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	public void print() {
		System.out.println("I'm Parent.");
	}
}
