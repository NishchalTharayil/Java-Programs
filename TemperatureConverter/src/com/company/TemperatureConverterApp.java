package com.company;
import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Fahrenheit to convert into Celsius: ");
		double fahrenheit = scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		
	}

}
