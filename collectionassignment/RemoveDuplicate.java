package com.java.collectionassignment;
import java.util.*;
public class RemoveDuplicate {
		public static void main(String[] args) {
			
		List<Integer> rd=new ArrayList<Integer>();
		rd.add(1);
		rd.add(1);
		rd.add(3);
		rd.add(2);
		rd.add(4);
		rd.add(2);
		for(int i=0;i<rd.size();i++) {
			for(int j=i+1;j<rd.size();j++) {
				if(rd.get(i)==rd.get(j)) {
					rd.remove(i);
					
				}
			}
		} System.out.println(rd);
	Collections.sort(rd);
	System.out.println("Ascending order:-"+rd);
	}

}
