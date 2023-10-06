package com.kodnest.Array;
import java.util.Scanner;

public class ArrayPattern {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int rows = scan.nextInt();
		System.out.println("Enter Number of Columns");
		int cols = scan.nextInt();
		int arr[][] = new int[rows][cols];
		
		System.out.println("Enter "+(rows*cols)+" Elements");
		for(int i =0;i<=arr.length-1;i++)
		{
			for(int j = 0;j<=arr[i].length-1;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();
		System.out.println("================================");
		for(int k = 0;k<=cols-1;k++)
		{
			System.out.print(arr[0][k]+" ");
		}
		
		for(int k = 1;k<=rows-1;k++)
		{
			System.out.print(arr[k][cols-1]+" ");
		}
		
		
		for(int k =cols-2; k >= 0; k--)
		{
			System.out.print(arr[rows-1][k]+" ");
		}

		for(int k = rows-2; k>=1;k--)
		{
			System.out.print(arr[k][0]+" ");
		}
		
		for(int k = 1;k<=cols-2;k++)
		{
			System.out.print(arr[1][k]);
		}
	}

}
