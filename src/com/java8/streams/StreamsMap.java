package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {
	
	public static void main(String args[]) {
		
	int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int x : array) {
	    		list.add(x);
	    }
	    
	 
	    //To double the values added in the previous list and add to new list
	    List<Integer> doubleList = list.stream().map(I-> I * 2).collect(Collectors.toList());
	    System.out.println(doubleList);
	    
	    
    
		 
	    String [] strArray = new String[] {"neha", "diya", "shashanka","hetal", "anshima", "drishti"};
	    ArrayList<String> strlist = new ArrayList<String>();
	    for(String x : strArray) {
	    		strlist.add(x);
	    		}
	    
	    
	    
	    //To double the values added in the previous list and add to new list
	    List<String> upperList = strlist.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	    System.out.println(upperList);
	    
	    
	}
	

}
