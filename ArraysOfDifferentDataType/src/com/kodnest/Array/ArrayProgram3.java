package com.kodnest.Array;
import java.util.Scanner;

public class ArrayProgram3 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of Players: ");
		Scanner scan= new Scanner(System.in);
		int user = scan.nextInt();
		Double arr[] = new Double[user];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Height of Player "+(i+1)+" :");
			arr[i]=scan.nextDouble();
		}
		
		System.out.println("Height of Players are: ");
		for(int i =0;i< arr.length;i++)
		{
			System.out.print(arr[i]+" | ");
		}
		scan.close();
	}

}
