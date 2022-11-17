package com.java.collectionassignment;
import java.util.*;
 class Student1 implements Comparable<Student1>{
int rollno;
String classname;
String sname;
int totalMarks;     //out of 500
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getTotalMarks() {
	return totalMarks;
}
public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
}
public Student1(int rollno, String classname, String sname, int totalMarks) {
	super();
	this.rollno = rollno;
	this.classname = classname;
	this.sname = sname;
	this.totalMarks = totalMarks;
}
public Student1() {
	super();
	// TODO Auto-generated constructor stub
} 
@Override
public String toString() {
	return "Student1 [rollno=" + rollno + ", classname=" + classname + ", sname=" + sname + ", totalMarks=" + totalMarks
			+ "]";
}
@Override
public int compareTo(Student1 o) {
	//Student1 s=(Student1)o;
	if(this.getTotalMarks()>o.getTotalMarks() ) {
		return 1;
	}else 
		return -1;
	
} 
public void percentage(Student1 a) {
	if((a.totalMarks/500)*100>50)
		System.out.println(a.sname);
}	

}


 public class Student{
	 public static void main(String[] args) {
		List<Student1> std=new ArrayList<Student1>();
		std.add(new Student1(1,"BE","Ankush",400));
		std.add(new Student1(2,"Btech","Ajit",300));
		std.add(new Student1(3,"BE","Meghraj",450));
		std.add(new Student1(4,"BE","amit",420));
		std.add(new Student1(5,"Bsc","lahu",430));
		Collections.sort(std);
		Student1 s1=new Student1();
		for(Student1 arr:std)
			s1.percentage(arr);
			
          
		
		
		
		System.out.println("first number student name:-"+std.get(std.size()-1).getSname());
		System.out.println("second number student name:-"+std.get(std.size()-2).getSname());
		System.out.println("third number student name:-"+std.get(std.size()-3).getSname());
		
		}
	}
 
