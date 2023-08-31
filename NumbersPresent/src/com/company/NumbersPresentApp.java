package com.company;

public class NumbersPresentApp {
	int numbers(int n)
	{
		int m = 0;
		int count =0;
		while(n>0)
		{
			int m =0;
			m = n % 10;
			n = n / 10;
			count++;
		}
		
		return count;
	}

}
