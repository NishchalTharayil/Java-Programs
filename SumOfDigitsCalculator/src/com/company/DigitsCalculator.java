package com.company;
import java.util.Scanner;

public class DigitsCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = scan.nextInt();
		sumOfDgits(n);
		scan.close();
	}
	
	public static void sumOfDgits(int n)
	{
		int sum = 0;
		int m = 0;
		while(n!=0)
		{
			m = n % 10;
			n = n/10;
			sum = sum + m;
		}
		System.out.println(sum);
	}
	
	

}
