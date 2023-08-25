package com.company;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printFibonacciSeries(n);
		scan.close();
	}
	
	public static void printFibonacciSeries(int n)
	{
		int num1 = 0;
		int num2 = 1;
		int num3;
		if(n==1)
		{
			System.out.println(num1);
		}
		else if(n==2)
		{
			System.out.print(num1+' '+num2);
		}
		else
		{
			System.out.print(num1+" "+num2);
			for(int i=3;i<=n;i++)
			{
				num3 = num2 + num1;
				System.out.print(" "+num3);
				num1=num2;
				num2=num3;
			}
			
		}
		
	}
}
