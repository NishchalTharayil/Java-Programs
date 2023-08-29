package com.company;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = scan.nextInt();
		checkPalindrome(n);
		scan.close();
	}
	
	public static void checkPalindrome(int n)
	{
		
		int palindrome = 0;
		int original =n;
		while(n>0)
		{
			int m = n % 10; 
			n = n / 10;
			palindrome = palindrome * 10 + m;
		}
		
		if(original == palindrome)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
	

}
