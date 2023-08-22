package com.company;
import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Speed:");
		double speed = scan.nextDouble();
		System.out.println("Enter Time:");
		double time = scan.nextDouble();
		JourneyCalculator journeycalculator = new JourneyCalculator();
		System.out.println(journeycalculator.calculateDistance(speed,time));
		scan.close();		
	}

}
