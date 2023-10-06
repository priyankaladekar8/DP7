package com.arrays;

import java.util.Scanner;

public class SearchNumber {
	static void seachArray(int ar[],int num)
	{
		boolean isPresent=false;
		for(int i=0; i<ar.length; i++)
		{
			if((num==ar[i]))
		   {
				isPresent=true;
				System.out.println(num+"is present is array at pos:"+(i+1));
			}
			
		}
		if(!isPresent)
		{
			System.out.println(num+"is not present is array");
		}
	}
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,3,4};
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		seachArray(arr,x);
		
	}

}
