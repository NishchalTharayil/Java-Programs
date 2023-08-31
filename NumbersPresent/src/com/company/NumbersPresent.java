package com.company;
import java.util.Scanner;

public class NumbersPresent {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		NumbersPresentApp numberApp = new NumbersPresentApp();
		int total =numberApp.numbers(n);
		System.out.println(total);
		scan.close();

	}

}
