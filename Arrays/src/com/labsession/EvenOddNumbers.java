package com.labsession;

import java.util.Arrays;

public class EvenOddNumbers {
	static void findEvenOdd(int arr[]) {
		int count = 0;
		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr1[count] = arr[i];
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr1[count] = arr[i];
			count++;
			}

		}
		System.out.println(Arrays.toString(arr1));

	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 5, 8 };
		System.out.println(Arrays.toString(arr));
		System.out.println("--------After shifting------------");
		findEvenOdd(arr);
	}

}
