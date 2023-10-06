package com.labsession;

import java.util.Arrays;

public class ShiftRight {
	static void shiftRight(int arr[]) {
		int count = 0;
		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
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
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String args[])

	{
		int arr[] = { -1, 2, 3, 4, -6, 5 - 3, -4 };
		System.out.println(Arrays.toString(arr));
		System.out.println("-----after shifting--------");
		shiftRight(arr);

	}

}
