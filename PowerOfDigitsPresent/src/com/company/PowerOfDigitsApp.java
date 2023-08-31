package com.company;

public class PowerOfDigitsApp 
{
	int powerOfNumber(int n)
	{
		int count = 0;
		while(n>0)
		{
			n = n/10;
			count++;	
		}
		return count;

	}
	
	
}
