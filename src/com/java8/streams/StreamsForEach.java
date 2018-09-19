package com.java8.streams;

import java.util.ArrayList;

public class StreamsForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int x : array) {
	    		list.add(x);
	    }
	    
	    list.stream().forEach(s-> System.out.println(s));
	}

}
