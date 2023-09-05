package com.CodeWithHarry.Array;

public class Solution1 {

	public static void main(String[] args) 
	{
		int total=0;
		int sum[]=new int[5];
		sum[0]=21;
		sum[1]=22;
		sum[2]=23;
		sum[3]=24;
		sum[4]=25;
		for(int i=0;i<sum.length;i++)
		{
			total = total + sum[i];
		}
		System.out.println(total);
	}

}
