package com.kodnest.Array;
import java.util.Scanner;

public class Anti_ClockArrayRotation {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i = 0;i <= arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter Number of Rotation");
		int rotate = scan.nextInt();
		
		System.out.println("Array Before "+rotate+" rotations");
		for(int i = 0; i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		for(int count=1; count <= rotate; count++)
		{
			int temp = arr[0];
			for(int i = 1;i <= arr.length-1;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		
		System.out.println();
		System.out.println("==============================================");
		
		System.out.println("Array after "+rotate+" rotations");
		for(int i = 0; i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
