package com.company;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = scan.nextInt();
		PowerApp power = new PowerApp();
		int res = power.powerOf(n);
		System.out.println(res);
		scan.close();
	}

}
