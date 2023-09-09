package com.kodnest.Array;
import java.util.Scanner;

public class ArrayProgram2 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of Employee: ");
		Scanner scan= new Scanner(System.in);
		int user = scan.nextInt();
		String arr[] = new String[user];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the name of Employee "+(i+1)+" :");
			arr[i]=scan.next();
		}
		
		System.out.println("Employee Names are: | ");
		for(int i =0;i< arr.length;i++)
		{
			System.out.print(arr[i]+" | ");
		}
		scan.close();
	}

}
