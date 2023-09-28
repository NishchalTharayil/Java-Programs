package com.kodnest.Algorithm;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Array before Sorting");
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		new BubbleSortApp().sort(arr);
		System.out.println("Array After Sorting");
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
