package com.StringAssignment;

public class Stringconstantpoolandheap {

	public static void Constantpool()
	 { 
	        String s1 = "ankush"; 
	        String s2 = "ankush"; 
	  
	       
	        if (s1 == s2) 
	           System.out.println("string in String constant pool is matching "); 
	        else
	           System.out.println("string in String constant pool is matching"); 
	    } 
	
public static void Heappool() {
	 String s1 = new String("aaa"); 
     String s2 = new String("aaa"); 

    
     if (s1 == s2) 
        System.out.println("string in Heap is matching "); 
     else
        System.out.println("string in Heap is matching"); 
}
	
	
	public static void main(String[] args) {
		Stringconstantpoolandheap.Constantpool();
		Stringconstantpoolandheap.Heappool();
		
	}
	
}
