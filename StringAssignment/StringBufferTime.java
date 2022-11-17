package com.StringAssignment;

public class StringBuffer {

	public static void main(String[] args) {
		
		
		        long startTime = System.currentTimeMillis();  
		        StringBuffer sb = new StringBuffer("sql");  
		        for (int i=0; i<10000; i++){  
		            sb.append("mysql");  
		        }  
		        System.out.println("Time for StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
		        startTime = System.currentTimeMillis();  
		        StringBuilder sb2 = new StringBuilder("sql");  
		        for (int i=0; i<10000; i++){  
		            sb2.append("mysql");  
		        }  
		        System.out.println("Time for StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
		    }  
		
	}


