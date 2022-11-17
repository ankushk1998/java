package com.java.collectionassignment;
import java.util.*;
public class AscendingOrder {
	public static void main(String[] args) {
	List<Integer> asd=new ArrayList<Integer>();
	asd.add(1);
	asd.add(2);
	asd.add(3);
	asd.add(2);
	asd.add(4);
	asd.add(2);
	Collections.sort(asd);
	System.out.println(asd);
	
}	

}
