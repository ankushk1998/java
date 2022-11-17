package com.java.collectionassignment;

import java.util.Collections;
import java.util.Vector;

public class vectorq {
public static void main(String[] args) {
	Vector<String> itm=new Vector<String>();
	itm.add("ankush");
	itm.add("meghraj");
	itm.add("ajit");
	Collections.sort(itm);
	System.out.println("Ascending order:-");

	for(String a:itm) {
		System.out.print(a+" ");
	}
	
}
}
