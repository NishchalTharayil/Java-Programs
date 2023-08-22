package com.company;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrimes(n);
	}
	
	public static void printPrimes(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(i % 2 != 0 && i % 3 != 0)
			{
				System.out.println(i);
			}
			
		}
	}

}
