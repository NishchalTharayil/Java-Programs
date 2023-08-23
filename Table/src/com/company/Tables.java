package com.company;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		tables(num);
		scan.close();

	}
	
	public static void tables(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +" X "+i+" = "+(num*i));
		}
	}

}
