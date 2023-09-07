package com.GeeksForGeeks.Array;
import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 Values:");
		scan.close();
		for(int i =0;i<=4;i++)
		{
			int size = scan.nextInt();
			arr[i]=size;
			
		}
		int max = arr[0];
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]>=max)
			{
				max = arr[i];
			}
		}
		System.out.println("The maximum number is: "+ max);
	}

}
