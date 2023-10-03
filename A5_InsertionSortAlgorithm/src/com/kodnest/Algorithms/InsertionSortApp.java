package com.kodnest.Algorithms;

public class InsertionSortApp 
{
	public void insert(int arr[])
	{
		int item;
		int j;
		for(int i = 1;i<=arr.length-1;i++)
		{
			item = arr[i];
			j = i - 1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println();
		System.out.print("Array after  Sorting: ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");	
		}
	}

}
