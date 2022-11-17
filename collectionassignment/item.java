package com.java.collectionassignment;
import java.util.*;

public class item
{
	
	public static void main(String[] args) {
	List<String> desc=new ArrayList<String>();
	desc.add("food");
	desc.add("fruit");
	desc.add("food");
	desc.add("shooes");
	desc.add("fruit");
	for(int i=0;i<desc.size();i++) {
		for(int j=i+1;j<desc.size();j++) {
			if(desc.get(i).equals(desc.get(j))) {
				desc.remove(i);
				
			}
				}
	} 
	System.out.println("unique name:-"+desc);
	System.out.println("Descending order:");

Collections.sort(desc);
//System.out.println(desc);
for(int i=desc.size()-1;i>-1;i--) {
	System.out.print(desc.get(i)+" ");
}
}
}

