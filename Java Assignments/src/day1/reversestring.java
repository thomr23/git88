package day1;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "I want to get back to office";
		String temp = "";
		int length = original.length();
		
		for (int i = length-1; i >=0; i--) {
			
			temp=temp+original.charAt(i);
			
		}
				
		System.out.println("String before reversing: "+original);
		System.out.println("String after reversing :"+temp);

	}

}
