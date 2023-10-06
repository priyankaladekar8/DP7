package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsterArray {
	static void insertNum(int arr[], int insert, int pos, int size) {
		
		for(int i=size-1; i>pos; i--)
		{
			arr[i+1]=arr[i];  //logic
			System.out.println(arr[i]);
			System.out.println(arr[i+1]);
		}
		arr[pos]=insert;
		size++;
		System.out.println(Arrays.toString(arr));
		
		 
	}
	
public static void main(String args[]) {
	int arr[]=new int[6];
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<5; i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	insertNum(arr,100,2,3);
}

}
