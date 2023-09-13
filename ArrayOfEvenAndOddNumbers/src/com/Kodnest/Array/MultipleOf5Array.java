package com.Kodnest.Array;
import java.util.Scanner;

public class MultipleOf5Array {

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
		
		System.out.println("Elements that are divisible by 5 are: ");
		for(int i =0 ; i<=arr.length-1;i++)
		{
			if(arr[i] % 5 ==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
