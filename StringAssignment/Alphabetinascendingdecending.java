package com.StringAssignment;

public class Alphabetsinascendindganddecending {
	
	public static void Acending() {
		char temp = 0;
		String a="Ankush";
		
		char c[]=a.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<a.length();j++) {
				if(c[i]>c[j]) {
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
			}
			
		}
		
	}
		System.out.println(c);
	}
	
	
	public static void Descending(String s) {
		char temp = 0;
		String a="anlkush";
		
		char c[]=a.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<a.length();j++) {
				if(c[i]<c[j]) {
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
			}
			
		}
		
	}
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		
		Alphabetsinacendindganddecending.Acending();
		
		Alphabetsinacendindganddecending.Descending("ankush");
		
		
	
		
		

	}

}
