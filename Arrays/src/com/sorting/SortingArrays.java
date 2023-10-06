package com.sorting;

import java.util.Arrays;

public class SortingArrays {
	static void sortAr(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				
				//swapping
				if (ar[i] > ar[j]) // (ar[i]<ar[j]
				{
			
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 3, 4, 8, 6, 7, 5 };
		System.out.println("Before:" + Arrays.toString(arr));
		sortAr(arr);
		System.out.println("After:" + Arrays.toString(arr));
		
	}

}
