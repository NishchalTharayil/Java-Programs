package com.kodnest.Strings;
import java.util.Scanner;

public class InitCapital {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str = scan.nextLine();
		char arr[] = str.toCharArray();
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			int temp=arr[i];
			int temp1 = arr[0];
			if(temp1 >= 97 && temp1 <= 122 )
			{
				temp = temp - 32;
				arr[0] = (char)temp;
			}
			if(temp == ' ')
			{
				temp = arr[i+1];
				if(temp >= 97 && temp <= 122)
				{
					temp = temp - 32;
				}
				arr[i+1] = (char)temp;
			}
			
			
		}
		str = new String(arr);
		System.out.println(str);
	}

}
