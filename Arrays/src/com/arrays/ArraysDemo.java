package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of arrays");
		int n=sc.nextInt();
		int arr[]= {1, 2, 3, 4, 5, 6, 7};
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the value:");
			arr[i]=sc.nextInt();
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}
}


