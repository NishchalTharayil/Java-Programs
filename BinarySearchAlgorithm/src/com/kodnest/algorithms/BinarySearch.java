package com.kodnest.algorithms;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int arr[] = new int[scan.nextInt()];
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println("Enter value "+(i+1));
			arr[i]=scan.nextInt();
		}
		int low = 0;
		int high = arr.length-1;
		System.out.println("Enter a value to search");
		int key = scan.nextInt();
		while(low<=high)
		{
			int mid = (low + high)/2;
			
			if(key==arr[mid])
			{
				System.out.println("Key Found at index "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				low = mid + 1;
				high = high;
			}
			else 
			{
				high = mid - 1;
				low = low;
			}
		}
		System.out.println("Key not found");
	}

}
