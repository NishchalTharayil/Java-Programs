package com.GeeksForGeeks.Array;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int num1 = scan.nextInt();
		int arrr[] = new int[num1];
		
		System.out.println("Enter "+num1+" Elements to the Array: ");
		for(int i = 0;i <= arrr.length-1; i++)
		{
			arrr[i] = scan.nextInt();
		}
		
		System.out.println("Enter an element to search in it: ");
		int search = scan.nextInt();
		int count =0;
		for(int i =0;i <= arrr.length-1; i++)
		{
			if(arrr[i] == search)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("This element is present! ");
		}
		else
		{
			System.out.println("This element is not present! ");
		}
		
		
	}

}
