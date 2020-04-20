package day1;

public class duplicateelement {

	public static void main(String[] args) {
		 int [] arr = new int [] {1,2,1,22,23,34,44,33,34,22,1,34};   
         
	        System.out.println("Duplicate elements in given array: ");  
	         
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	    }  

	}


