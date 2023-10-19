package com.kodnest.Competitive;
import java.util.Scanner;

public class AmountDoublingTimeCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter interest rate");
		double interest = scan.nextDouble();
		System.out.println("Enter the Amount ");
		double amount = scan.nextInt();
		double goal = amount * 2;
		int year = 0;
		
		while(amount<goal)
		{
			amount = amount + (amount * interest);
			year++;
		}
		System.out.println("It takes "+year+" years for the investment to double.");
	}

}
