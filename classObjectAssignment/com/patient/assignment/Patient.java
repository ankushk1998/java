package com.patient.assignment;

public class Patient {
	private String name;
	private double height;
	private double weight;
	public Patient(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double Bmi() {
		return weight/(height*height);
	}
 public static void main(String[] args) {
	Patient p1=new Patient("Ankush Karande",1.65,68);
	System.out.println("BMI of "+p1.name+" is "+p1.Bmi());
}

}
