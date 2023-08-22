package com.company;
import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printEvenNumbers(n);
	}
	
	public static void printEvenNumbers(int n)
	{
		int m =0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
