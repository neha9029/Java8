package com.java8.streams;

import java.util.ArrayList;

public class StreamsMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = new int[] {6,2,3,5,1,6,4,8,10,9};
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int x : array) {
	    		list.add(x);
	    }
	    
	    
	    //get min from list using stream
	    Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
	    System.out.println(min);
	    
	    
	    //get max from list using stream
	    Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
	    System.out.println(max);
	    
	}
	
	

}
