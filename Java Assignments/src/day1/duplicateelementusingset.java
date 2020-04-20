package day1;

import java.util.HashSet;

public class duplicateelementusingset {
	

	public static void main(String[] args) {
		int [] arr= new int []{1,2,1,22,23,34,44,33,34,22,1,34};
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for (int element : arr) {
		     if (! set.add(element)) {
		        System.out.println(element);
		     }
		}
	}

}
