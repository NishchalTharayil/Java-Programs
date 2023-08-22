package com.company;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		facto(n);
	}
	
	public static void facto(int n)
	{
		int m=1;
		for(int i = 1; i<=n;i++)
		{
			m = m * i;
		}
		System.out.println(m);
	}

}
