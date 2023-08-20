package com.company;
import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select the Conversion: ");
		System.out.println("Enter 1: Celsius To Fahrenheit");
		System.out.println("Enter 2: Fahrenheit To Celsius ");
		int input = scan.nextInt();
		if(input==1)
		{
			System.out.println("Please Enter Celsius to Convert");
			double user_input = scan.nextDouble();
			celsiusToFahrenheit(user_input);
		}
		else
		{
			System.out.println("Please Enter Fahenheit to Convert");
			double user_input = scan.nextDouble();
			fahreheitToCelsius(user_input);
		}
		
	}
	
	public static void celsiusToFahrenheit(double user_input)
	{
		double celsius=(user_input * 9/5) + 32;
		System.out.println(celsius);
	}
	
	public static void fahreheitToCelsius(double user_input)
	{
		double fahreheit = (user_input - 32) * 5/9;
		System.out.println(fahreheit);
	}
	
}
