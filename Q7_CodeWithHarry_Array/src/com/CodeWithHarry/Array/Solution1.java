package com.CodeWithHarry.Array;

public class Solution1 {

	public static void main(String[] args) 
	{
		float total=0;
		float sum[]=new float[5];
		sum[0]=21.3f;
		sum[1]=22.3f;
		sum[2]=23.3f;
		sum[3]=24.3f;
		sum[4]=25.3f;
		for(int i=0;i<sum.length;i++)
		{
			total = total + sum[i];
		}
		System.out.println(total);
	}

}
