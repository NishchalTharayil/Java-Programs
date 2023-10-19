package com.kodnest.Strings;
import java.util.Scanner;

public class ReplaceCharInString {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		str=str.replace(" ", "99");
		System.out.println(str);
	}

}
