package com.GeeksForGeeks.Array;
import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int arr1[] = new int[4];
		int arr2[]= new int[4];
		
		for(int i =0;i<=arr1.length-1;i++)
		{
			System.out.println("Enter a value to First Array");
			arr1[i] = scan.nextInt();
		}
		
		for(int i =0;i<=arr2.length-1;i++)
		{
			System.out.println("Enter a value to Second Array");
			arr2[i] = scan.nextInt();
		}
		scan.close();
		for(int i =0;i<arr1.length;i++)
		{
			sum = sum +arr1[i]+arr2[i];
		}
		System.out.println("The sum of two Arrays is: "+sum);
		
	}

}
