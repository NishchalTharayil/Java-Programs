package com.kodnest.competitive;
import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		String str2 = new String();
		scan.close();
		for(int i =0;i<=str.length()-1;i++)
		{
			char c = str.charAt(i);
			if(str2.contains(String.valueOf(c))==false)
			{
				str2 = str2.concat(String.valueOf(c));
			}
		}
		
		System.out.println(str2);
	}

}
