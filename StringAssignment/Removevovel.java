package com.StringAssignment;

public class Removevovel {
	
	
	public static void vow() {
		char r=0;
		
		char nonvowel;
		
		String s="aeiouabdcsd";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		
			}else {
//				
				System.out.print(ch[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		Removevovel.vow();
	}

}
