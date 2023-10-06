package com.arrays;

import java.util.Scanner;

public class FindNum {
	
	static void searchArray(int ar[], int num)
	{
		boolean isPresent=false;
		for(int i=0;i<ar.length;i++)
		{
			if(num==ar[i])
			{
				isPresent=true;
				break;
			}
		}
		
		if(isPresent)
		{
			System.out.println(num+" is present in array");
		}
		else
		{
			System.out.println(num+" is not present in array");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,2,6,7};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find:");
		
		int x=sc.nextInt();
		
		searchArray(arr, x);
		
	}

}
