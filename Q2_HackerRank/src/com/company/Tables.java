package com.company;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        tables(n);
    }

	public static void tables(int n)
    {
		for(int i=1;i<=10;i++)
		{
			 System.out.println(n+ " x "+i+" = "+(n*i));

		}
    }
}
		        
