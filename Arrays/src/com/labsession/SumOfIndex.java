package com.labsession;

import java.util.Arrays;

public class SumOfIndex {
	static void sumofFirstandLastDigit(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length ; i++) {
			sum = arr[i] + arr.length - i;
		}
		System.out.println("the sum of the fist and last digit: " + sum);
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));
		sumofFirstandLastDigit(arr);
	}

}
