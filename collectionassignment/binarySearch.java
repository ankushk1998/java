package com.java.collectionassignment;
import java.util.*;
public class binarySearch {
	public static void main(String[] args) {
		List<Integer> bs=new ArrayList<Integer>() ;
			bs.add(1);
			bs.add(5);
			bs.add(5);
			bs.add(3);
			bs.add(6);
		int length=bs.size();
		int arr[]=new int[length];
		for(int i=0;i<bs.size();i++) {
			arr[i]=bs.get(i);
		}
		int numbertofind=3;
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];
		
			if(val==numbertofind) {
				System.out.println("position of number:-" +i);
			}

		}
		
	}

}
