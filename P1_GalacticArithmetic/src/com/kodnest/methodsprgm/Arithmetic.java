package com.kodnest.methodsprgm;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		System.out.println(add(num1,num2));
	}
	
	public static Long add(long num1, long num2)
	{
		return num1 + num2;
	}

}
