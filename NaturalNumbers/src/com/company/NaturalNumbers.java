package com.company;
import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		calculateSum(n);
		
	}
	public static void calculateSum(int n)
	{
		int m =0;
		for(int i =0;i<=n;i++)
		{
			m = m + i;	
		}
		System.out.println(m);
		
		
	}
}
