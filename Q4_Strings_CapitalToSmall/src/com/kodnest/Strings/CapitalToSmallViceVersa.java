package com.kodnest.Strings;
import java.util.Scanner;

public class CapitalToSmallViceVersa {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		for(int i =0;i<=arr.length-1;i++)
		{
			int temp = arr[i];
			if(temp >= 65 && temp <= 90)
			{
				temp = temp + 32;
			}
			else if(temp >= 97 && temp <= 122)
			{
				temp = temp - 32;
			}
			arr[i] = (char)temp;
		}
		scan.close();
		str = new String(arr);
		System.out.println(str);
	}

}
