package com.merging;

import java.util.Arrays;

public class AternateMerge {
	static int[] mergeArray(int arr1[], int arr2[]) {
		int mar[] = new int[arr1.length + arr2.length];
		int index = 0;
		int maxLength = Math.max(arr1.length, arr2.length);
		for (int i = 0; i < maxLength; i++) {
			if (i < arr1.length) {
				mar[index] = arr1[i];
				index++;
			}
			if (i < arr2.length) {
				mar[index] = arr2[i];
				index++;
			}
		}
		return mar;
	}

	public static void main(String args[]) {
		int arr1[] = { 2, 3, 4, 5, 6 };
		int arr2[] = { 11, 12, 13 };
		int mergeArray[] = mergeArray(arr1, arr2);
		System.out.println(Arrays.toString(mergeArray));
	}

}
