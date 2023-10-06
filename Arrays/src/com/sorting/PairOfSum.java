package com.sorting;

import java.util.Arrays;

public class PairOfSum {

	static void findPairs(int arr[], int s) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > s)
				continue;
		

		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] + arr[j] == s)
				
			{
				System.out.println("pair:" + "(" + arr[i] + "," + arr[j] + ")");
			}
		}
	}

	}

	public static void main(String args[]) {
		int arr[] = { 1, 4, 5, 6, 7, 2, 3 };
		int sum=7;
		findPairs(arr,sum);
	}

}
