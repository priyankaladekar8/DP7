package com.arrays;

import java.util.Scanner;

public class PrimeNumber {
	static void checkPrime(int num) {

		boolean status = true;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				status = false;
				break;
			}

		}
		if (status) {
			int sum = 0;
			System.out.println(num);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 4, 7, 8, 9, 6, 11 };
		for (int i = 0; i < arr.length; i++) {
			checkPrime(arr[i]);
		}

	}
}
