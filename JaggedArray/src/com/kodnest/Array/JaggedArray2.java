package com.kodnest.Array;
import java.util.Scanner;

public class JaggedArray2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double arr[][]=new double[5][];
		arr[0]=new double[7];
		arr[1]=new double[5];
		arr[2]=new double[6];
		arr[3]=new double[11];
		arr[4]=new double[6];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j = 0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter Game "+i+" Player Height "+j);
				arr[i][j]=scan.nextDouble();
			}
		}
		scan.close();
		System.out.println("The Heights of Players in Different Games is: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j = 0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" | ");
		
			}
			System.out.println();
		}
	}
}
