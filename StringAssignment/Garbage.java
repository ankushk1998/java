package com.StringAssignment;

public class Garbage {
	  public void m1() {
	        String s = "ankush karande";
	        System.out.println(s);
	    }
	    public void finalize() {
	        System.out.println("garbage collector");
	    }

	public static void main(String[] args) {
		
		  
		Garbege str1 = new Garbege();
		        
		       
		        str1=null;
		        System.gc();
		    }
	}


