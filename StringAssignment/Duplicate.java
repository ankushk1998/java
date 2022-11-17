package com.StringAssignment;

public class Duplicate {
	
	
	public static void Duplicate() {
		String s="hello i am ankush";
		char temp;
		int count=1;
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ' && ch[j]!=' ') {
					ch[j]=' ';
		             count++;
				
				}
			}
			if(count>1) {
				System.out.println(ch[i]+" "+count);
			}
			
		}
	
	}
	
	
	public static void main(String[] args) {
		

		Dublicate.Duplicate();
	}

}
