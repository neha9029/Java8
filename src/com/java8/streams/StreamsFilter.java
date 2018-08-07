package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {
	
	
	public static void main(String args[]) {
		int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int x : array) {
	    		list.add(x);
	    }
	
	    
	    //To add even numbers from list to another list
	    List<Integer> evenList = list.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
	    
	    System.out.println(evenList);
	}
}
