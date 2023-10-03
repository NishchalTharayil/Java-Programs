package com.kodnest.Algorithms;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int arr[]=new int[scan.nextInt()];
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the value "+(i+1));
			arr[i]=scan.nextInt();
		}
		System.out.print("Array before  Sorting: ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");	
		}
		
		new InsertionSortApp().insert(arr);
	}

}
