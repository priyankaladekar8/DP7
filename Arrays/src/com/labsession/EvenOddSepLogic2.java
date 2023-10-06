package com.labsession;

import java.util.Arrays;

public class EvenOddSepLogic2 {
	static void sepEvenOdd(int ar[]) {
		int pos = 0;
		int temp;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				temp = ar[i];
				ar[i] = ar[pos];
				ar[pos] = temp;
				pos++;
			}
		}
		System.out.println(Arrays.toString(ar));

	}

	public static void main(String args[]) {
		int arr[] = { 2, 4, 6, 7, 8, 9, 1 };
		sepEvenOdd(arr);
	}
}
