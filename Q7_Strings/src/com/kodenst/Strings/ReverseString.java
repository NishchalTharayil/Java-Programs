package com.kodenst.Strings;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = scan.nextLine();
		char arr1[]= str.toCharArray();
		
		System.out.print("The Entered Characters of a String is --> ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("The Reversal Characters of a String is --> ");
		for(int i = arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]+ " ");
		}
		char arr2[]= new char[arr1.length];
		int j = arr2.length-1;
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		System.out.println();
		str=new String(arr1);
		String str2=new String(arr2);
		System.out.println("The string Entered by you --> "+str);
		System.out.println("The Reversal of a String --> "+str2);
	}

}
