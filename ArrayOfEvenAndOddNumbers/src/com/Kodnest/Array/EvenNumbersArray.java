package com.Kodnest.Array;
import java.util.Scanner;

public class EvenNumbersArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" values: ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("Even number Elements are: ");
		for(int i =0 ; i<=arr.length-1;i++)
		{
			if(arr[i] % 2 ==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
