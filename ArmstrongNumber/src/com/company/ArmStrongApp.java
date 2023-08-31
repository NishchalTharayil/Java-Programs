package com.company;

public class ArmStrongApp 
{
	int armStrong(int n)
	{
		int cube = 0;
		int m = 0;
		while(n>0)
		{
			m = n % 10;
			n = n / 10;
			cube = cube +(m * m * m);
		}
		return cube;
	}
	
	boolean checkArmstrong(int n,int res)
	{
		if(n == res)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
