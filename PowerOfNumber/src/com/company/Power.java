package com.company;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an Number: ");
		int n = scan.nextInt();
		System.out.print("Enter Square: ");
		int m = scan.nextInt();
		PowerApp powerApp = new PowerApp();
		int res = powerApp.powerOfNumber(n,m);
		System.out.println(res);
	}
	

}
