package com.company;
import java.util.Scanner;

public class StringJoiner {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Fisrt Name: ");
		String str1 = scan.nextLine();
		System.out.println("Enter Your Second Name: ");
		String str2 = scan.nextLine();
		System.out.println(joinStrings(str1,str2));
	}
	
	public static String joinStrings(String str1, String str2)
	{
		return str1 + " "+str2;
	}

}
