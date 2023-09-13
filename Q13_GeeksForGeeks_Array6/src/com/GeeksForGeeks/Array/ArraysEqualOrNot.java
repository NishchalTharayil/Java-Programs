package com.GeeksForGeeks.Array;
import java.util.Scanner;

public class ArraysEqualOrNot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array1: ");
		int arr1[]= new int[scan.nextInt()];
		System.out.println("Enter the size of Array2: ");
		int arr2[]= new int[scan.nextInt()];
		
		System.out.println("Enter the Elements of Array1: ");
		for(int i =0;i<=arr1.length-1;i++)
		{
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the Elements of Array2: ");
		for(int i =0;i<=arr2.length-1;i++)
		{
			arr2[i] = scan.nextInt();
		}
		
		System.out.println("Array 1 Elements are: ");
		for(int i = 0;i <= arr1.length-1;i++)
		{
			System.out.print(arr1[i]+ " | ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Array 2 Elements are: ");
		for(int i = 0;i <= arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" | ");
		}
		System.out.println();
		System.out.println();
		
		int count = 0;
		int count1 = 0;
		
		if(arr1.length==arr2.length)
		{
			for(int i =0;i<=arr1.length-1;i++)
			{
				if(arr1[i]==arr2[i])
				{
					count++;
					if(count==arr1.length)
					{
						System.out.println("Yes! The elements of both the arrays are same.");
					}
				}
				else 
				{
					System.out.println("No! The elements of both the arrays are not equal.");
					return;
				}
				
			}
		}
		else 
		{
			System.out.println("No! The elemnts of the Arrays are not equal.");
			
		}
		

	}

}
