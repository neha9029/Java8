package com.java8.streams;

import java.util.ArrayList;


public class StreamsCount {
	
	public static void main(String args[]) {
	
	  String [] strArray = new String[] {"neha", "diya", "shashanka","hetal", "anshima", "drishti"};
	    ArrayList<String> strlist = new ArrayList<String>();
	    for(String x : strArray) {
	    		strlist.add(x);
	    		}
	    
	    
	    
	    //To double the values added in the previous list and add to new list
	    long count = strlist.stream().filter(s-> s.length() >= 5).count();
	    System.out.println(count);
	    
	}

}
