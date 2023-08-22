package com.company;
import java.util.Scanner;

public class GalacticArithmetic {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		long num1 = scan.nextLong();
		System.out.println("Enter number 2: ");
		long num2 = scan.nextLong();
		long sum = galacticAddition(num1,num2);
		System.out.println("The sum of given two numbers is: "+sum);
		scan.close();
	}
	
	public static long galacticAddition(long num1, long num2)
	{
		
		return num1 + num2;
	}

}
