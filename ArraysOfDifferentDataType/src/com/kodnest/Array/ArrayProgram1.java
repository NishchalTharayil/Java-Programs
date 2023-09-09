package com.kodnest.Array;
import java.util.Scanner;

public class ArrayProgram1 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of Students: ");
		Scanner scan= new Scanner(System.in);
		int user = scan.nextInt();
		int arr[] = new int[user];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Marks of Student "+(i+1)+" :");
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Student Marks are: | ");
		for(int i =0;i< arr.length;i++)
		{
			System.out.print(arr[i]+" | ");
		}
		scan.close();
	}

}
