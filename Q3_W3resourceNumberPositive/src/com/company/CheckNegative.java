package com.company;
import java.util.Scanner;

public class CheckNegative {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if(num < 0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is Positive");
		}
	}

}
