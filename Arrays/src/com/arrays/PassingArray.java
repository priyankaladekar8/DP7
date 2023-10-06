package com.arrays;

import java.util.Arrays;

public class PassingArray {
	static void squareArray(int ar[])
	{
		for (int i=0; i<ar.length; i++)
		{
			ar[i]= ar[i]* ar[i];
		}
		System.out.println(Arrays.toString(ar));
	}
	public static void main(String args[])
	{
		int arr[]= {1, 6,7,8,3};
		System.out.println("Before:"+Arrays.toString(arr));
		squareArray(arr);
		System.out.println("After:"+Arrays.toString(arr));
	}

}
