package com.kodnest.String;
import java.util.Scanner;

public class StringToCharToString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		System.out.print("The Characters you Entered is: ");
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		String res = toString(arr);
		System.out.println("Created String: "+res);
		scan.close();
	}
	
	public static String toString(char[] arr)
	{
		StringBuffer sb = new StringBuffer();
		for(int i= 0;i<=arr.length-1;i++)
		{
			sb.append(arr[i]);
		}
		String res = sb.toString();
		return res;
	}
}
