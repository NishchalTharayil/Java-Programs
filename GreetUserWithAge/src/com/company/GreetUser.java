package com.company;
import java.util.Scanner;

public class GreetUser {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scan.next();
		System.out.println("Enter your Year of Birth: ");
		int year = scan.nextInt();
		greet(name);
		int age= ageCalci(year);
		System.out.println("You're "+age+" years old!");
	}
	
	public static void greet(String name)
	{
		System.out.println("Hello" +name+" How are you!");
	}
	
	public static int ageCalci(int year)
	{
		int age = 2023 - year;
		return age;
	}

}
