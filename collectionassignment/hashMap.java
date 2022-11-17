package com.java.collectionassignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashMap {
public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("pune",1000000);
	hm.put("mumbai",2000000);
	hm.put("solapur",500000);
	hm.put("ahmadnagar", 100000);
	for(Entry<String, Integer> m : hm.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	
}   
}
