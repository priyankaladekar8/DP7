package com.sorting;

import java.util.Arrays;

public class RotateRightArray {
	static void rotateOnce(int ar[])
	{
		int lastE = ar[ar.length - 1];
		for (int i = ar.length - 1; i > 0; i--) 
		{
			ar[i] = ar[i - 1];
		}
		ar[0] = lastE;
		// System.out.println(Arrays.toString(ar));
	}

	public static void main(String args[]) 
	{
		int arr[] = { 3, 1, 2, 5, 6, 4 };
		System.out.println("Before:");
		System.out.println(Arrays.toString(arr));
		int n = 3;
		for (int i = 0; i < n; i++) 
		{
			rotateOnce(arr);
		}
			System.out.println(Arrays.toString(arr));
		}
}
	
