package com.kodnest.Strings;
import java.util.Scanner;
public class StringToCharArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		char str2[] = str.toCharArray();
		for(int i =0;i<=str2.length-1;i++)
		{
			System.out.println(str2[i]);
		}
		scan.close();
	}

}
