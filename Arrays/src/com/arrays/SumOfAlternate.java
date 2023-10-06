package com.arrays;

public class SumOfAlternate {
	static void alternateNum(int[]arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("alternatenumber is "+sum);
	}
		
		
	
	public static void main(String args[]) {
		int arr[]= {5,4,5,7,6,8};
		alternateNum(arr);
	}

}
