package com.box.assignment;

public class Box {
	private int weight;
	private int height;
	private int depth;
	public Box(int weight, int height, int depth) {
		super();
		this.weight = weight;
		this.height = height;
		this.depth = depth;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Box() {
	this(20,20,20);
	}
	public int Volume() {
		return this.weight*this.height*this.depth;
	}
	public static void main(String[] args) {
		Box b1=new Box(10,10,10);
		System.out.println("Volume is "+b1.Volume());
		Box b2=new Box();
	System.out.println("volume second method "	+b2.Volume());
	Box b3=new Box();
	b3.weight=10;
	b3.height=50;
	b3.depth=40;
	System.out.println("volume by third method "+b3.Volume());
	}
	
	

}
