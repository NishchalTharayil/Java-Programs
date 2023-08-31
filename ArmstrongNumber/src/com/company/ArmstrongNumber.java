package com.company;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = scan.nextInt();
		ArmStrongApp armstrong = new ArmStrongApp();
		int res = armstrong.armStrong(n);
		boolean result = armstrong.checkArmstrong(n,res);
		System.out.println(result);
		scan.close();
	}
}
