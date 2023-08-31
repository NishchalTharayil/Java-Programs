package com.company;
import java.util.Scanner;
public class PowerOfDigits {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an Number: ");
		int n = scan.nextInt();
		PowerOfDigitsApp power = new PowerOfDigitsApp();
		int res = power.powerOfNumber(n);
		total(n,res);
	}
	public static void total(int n, int m)
	{
		int total = 1;
		for(int i = 1;i<=m; i++)
		{
			total = total * n;
		}	
		
		System.out.println(total);
	}	

}
