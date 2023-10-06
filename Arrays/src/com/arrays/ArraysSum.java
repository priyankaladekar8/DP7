package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value:");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum is:" + sum);
		float ar[] = { 67.5f, 78.6f, 34.5f, 55.5f, 34.4f };
		float sumi = 0f;

	}

}
