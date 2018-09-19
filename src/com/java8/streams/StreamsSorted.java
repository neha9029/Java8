package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = new int[] {6,2,3,5,1,6,4,8,10,9};
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int x : array) {
	    		list.add(x);
	    }
	    
	   List<Integer> sortedList  = list.stream().sorted().collect(Collectors.toList());
	   System.out.println(sortedList);
	   
	  
	   List<Integer> reverseList = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
	   System.out.println(reverseList);
	   
	  
	}

}
