package com.GeeksForGeeks.Array;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int arr1[]=new int[5];
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.println("Enter value to position "+i);
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("------------------------------------------------------");
		System.out.print("The Copied elements from array 1 to array 2 is: ");
		for(int i = 0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
			System.out.print(arr1[i]+" | ");
		}
		
	}

}
