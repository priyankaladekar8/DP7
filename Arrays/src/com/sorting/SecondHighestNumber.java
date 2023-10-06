package com.sorting;

import java.util.Arrays;

public class SecondHighestNumber {
	
	  static void sortAr(int ar[])
	  {
		  for(int i=0;i<ar.length;i++)
		  {
			  for(int j=i+1; j<ar.length; j++)
			  {
				  //swapping
				  if(ar[i]>ar[j]) // ascending
				  {
					  int temp=ar[i];
					  ar[i]= ar[j];
					  ar[j]=temp;
				  }
			  }
		  }
		  
	  }

	public static void main(String[] args) {
		
		int arr[]= {3,4,6,7,5,4};
		
		System.out.println("Before:"+Arrays.toString(arr));
		sortAr(arr);
		System.out.println("After Sorting:"+Arrays.toString(arr));
		
		System.out.println("second highest number :" +arr[arr.length-2]);
		
   }
}
