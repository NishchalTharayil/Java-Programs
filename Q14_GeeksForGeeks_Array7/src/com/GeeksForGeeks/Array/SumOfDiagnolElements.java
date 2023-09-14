package com.GeeksForGeeks.Array;
import java.util.Scanner;

public class SumOfDiagnolElements {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array 1 and Array 2: ");
		int arr1[][] = new int[scan.nextInt()][scan.nextInt()];
		
		for(int i = 0;i<=arr1.length-1;i++)
		{	
			for(int j =0;j<=arr1[i].length-1;j++)
			{
				System.out.println("Enter the Element Array "+(i+1)+" Position "+(j+1));
				arr1[i][j] = scan.nextInt();
			}
		}
		
		int sum = 0;
		for(int i =0;i<=arr1.length-1;i++)
		{
			for(int j =0;j<=arr1[i].length-1;j++)
			{
				if(arr1[i]==arr1[j]) 
				{
					sum = sum + arr1[i][j];
				}
			}
		}
		int sum1=0;
		System.out.println("The sum of primary Diagnol is: "+ sum);
		for(int i = 0;i<=arr1.length-1;i++)
		{
			for(int j =arr1[i].length-1;j>=0;j--)
			{
				if((i+j)==(arr1.length-1))
				{
					sum1 = sum1 + arr1[i][j];
				}
				
			}
		}
		System.out.println("The sum of Secondary Diagnol is: "+sum1);
		
	
		
		
		

	}

}
