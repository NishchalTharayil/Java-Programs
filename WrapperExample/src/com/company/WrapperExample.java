package com.company;

public class WrapperExample {

	public static void main(String[] args) 
	{
		Integer a = 20;
		int b = a;
		System.out.println(a+ " " + b);
		String str = "20";
		int c = Integer.parseInt(str);
		System.out.println(str+" "+c*2);
		
		/*OUTPUT = 20 20
		           20 40  */

	}

}
