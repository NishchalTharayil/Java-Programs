package com.company;
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		findGCD(a,b);
		scan.close();
		
	}
	
	public static void findGCD(int a ,int b)
	{
		while(b!=0)
		{
			int rem = a % b;
			a = b;
			b = rem;
		}
		System.out.println(a);
	}

}
