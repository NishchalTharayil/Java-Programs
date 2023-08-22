package com.company;
import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num 1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter Num 2: ");
		int num2 = scan.nextInt();
		System.out.println(subtractNumbers(num1,num2));
		System.out.println("Enter Num 1: ");
		int num3 = scan.nextInt();
		System.out.println("Enter Num 2: ");
		int num4 = scan.nextInt();
		System.out.println(multiplyNumbers(num3,num4));
		System.out.println("Enter Num 1: ");
		int num5 = scan.nextInt();
		System.out.println("Enter Num 2: ");
		int num6 = scan.nextInt();
		System.out.println(divideNumbers(num5,num6));
		System.out.println("Enter Num 1: ");
		int num7 = scan.nextInt();
		System.out.println("Enter Num 2: ");
		int num8 = scan.nextInt();
		System.out.println(findRemainder(num7,num8));	
		scan.close();
	}
	
	public static int subtractNumbers(int num1, int num2)
	{
		return num1 - num2;
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		return num1 * num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1 / num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1 % num2;
	}

}
