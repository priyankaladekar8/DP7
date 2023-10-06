package com.arrays;

public class SumEvenArrays {
	static int findSum(int ar[]) {
		int sum=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
			{
				sum=sum+ar[i];
			}
		}
		
		return sum;
	}
	public static void main(String args[]) {
		int arr[]= {4, 5, 9,10,2,45};
		System.out.println("sum of even number is:"+findSum(arr));
		}
	}


