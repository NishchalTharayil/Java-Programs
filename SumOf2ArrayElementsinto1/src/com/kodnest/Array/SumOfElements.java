package com.kodnest.Array;
import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Arrays:");
		int arr1[]= new int[scan.nextInt()];
		int arr2[]= new int[arr1.length];
		int arr3[]= new int[arr1.length];
		
		System.out.println("Enter "+arr1.length+" Elements for Array1: ");
		for(int i = 0; i <= arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Enter "+arr1.length+" Elements for Array2: ");
		for(int i = 0; i <= arr1.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		
		System.out.println("Sum of Elements for Array1 and Array2: ");
		for(int i = 0; i <= arr1.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
			System.out.print(arr3[i]+" ");
		}
	}

}
