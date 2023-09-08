package com.kodnest.Array;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[][]= new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[4];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter Class "+i+" Student "+j);
				arr[i][j]=scan.nextInt();
			}
			
		}
		scan.close();
		
		System.out.println("The Age of students of All 3 Classes are: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}
		
	}

}
