package com.java.algorithms;
import java.util.Scanner;

public class LinearSearch {

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
		scan.close();
		
		System.out.println("Enter an element to search in it: ");
		int search = scan.nextInt();
		for(int i =0;i <= arrr.length-1; i++)
		{
			if(arrr[i]==search)
			{
				System.out.println("The key is found");
				return ;
			}
		}
		
		System.out.println("The Key is not found");
	}

}
