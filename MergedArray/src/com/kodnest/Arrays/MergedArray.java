package com.kodnest.Arrays;
import java.util.Scanner;

public class MergedArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of first Array: ");
		int size1 = scan.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter the Size of Second Array: ");
		int size2 = scan.nextInt();
		int arr2[] = new int[size2];
		int total[]= new int[arr1.length+arr2.length];
		System.out.println("The size of total array: "+total.length);
		
		for(int i = 0; i <= arr1.length-1;i++)
		{
			System.out.println("Enter the Value "+(i+1)+" of Array 1:");
			arr1[i] = scan.nextInt();
		}
		
		for(int i = 0; i <= arr2.length-1;i++)
		{
			System.out.println("Enter the Value "+(i+1)+"  of Array 2:");
			arr2[i] = scan.nextInt();
		}
		System.out.println("The Addition of Two Arrays to One array values are:");
		for(int i = 0; i <= arr1.length-1;i++)
		{
			total[i] = arr1[i];
		}
		for(int i = 0;i<=arr2.length-1;i++)
		{
			total[arr1.length+i]=arr2[i];
		}
		System.out.println("Third Array--> ");
		for(int i = 0;i<=total.length-1;i++)
		{
			System.out.print(total[i]+ " ");
		}
	}

}
