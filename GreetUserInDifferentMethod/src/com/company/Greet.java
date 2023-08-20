package com.company;
import java.util.Scanner;

public class Greet {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scan.next();
		greet(name);
		scan.close();
	}
	
	public static void greet(String name)
	{
		System.out.println("Hello "+name+" How are you! ");
	}

}
