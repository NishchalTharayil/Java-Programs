package com.company;

public class PowerApp {
	int powerOfNumber(int n, int m)
	{
		int total = 1;
		for(int i = 1;i<=m;i++)
		{
			total = total * n;
		}
		
		return total;
	}

}
