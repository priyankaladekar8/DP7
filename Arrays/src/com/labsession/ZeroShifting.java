package com.labsession;

import java.util.Arrays;

public class ZeroShifting {
	static int[] zeroShift(int arr[]) {
		int count = 0;
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				arr1[count] = arr[i];
				count++;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				arr1[count] = arr[i];
				count++;
			}
		}
		return arr1;

	}

	public static void main(String args[]) {
		int arr[] = { 2, 0, 4, 0, 6, 7 };
		System.out.println(Arrays.toString(arr));
		zeroShift(arr);

	}

}
