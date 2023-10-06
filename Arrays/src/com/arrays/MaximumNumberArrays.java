package com.arrays;

public class MaximumNumberArrays {
	static void findMax(int ar[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("Maximum element is:"+max);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,6,8,7};
		findMax(arr);
		
	}

}
