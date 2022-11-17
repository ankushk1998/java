package com.StringAssignment;

public class Joinindex {

	public static String A(String s,String n, int ind){
	      
	  
	        
	        String Str = new String(); 
	  
	        for (int i = 0; i < s.length(); i++) { 
	  
	            
	            Str += s.charAt(i); 
	  
	            if (i == ind) {
	                Str += n; 
	            } 
	        } 
	  
	       
	        return Str; 
	    } 
	  
	  
	    public static void main(String[] args) 
	    { 
	  
	      
	        String a= "ankush"; 
	        String b = "aa"; 
	        int d = 4; 
	   
	        System.out.println("index: "
                    + d); 
	        System.out.println("new String: "
	                           + a); 
	        System.out.println("after join String: "
	                           + A(a, b, d)); 
	    } 

	}


