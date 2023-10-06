package com.sorting;
import java.util.Arrays;
public class RotateLeftArryas {

		static void rotateOnce(int arr[])
		{
			int firstE = arr[0];
			for (int  i =arr.length-1; i<0; i++) 
			{
				arr[arr.length-1] = arr[i];
			}
			arr[arr.length-1] = firstE;
			// System.out.println(Arrays.toString(ar));
		}

		public static void main(String args[]) 
		{
			int arr[] = { 3, 1, 2, 5, 6, 4 };
			System.out.println("Before:");
			System.out.println(Arrays.toString(arr));
			int n = 3;
			for (int i = 0; i < n; i++) 
			{
				rotateOnce(arr);
			}
				System.out.println(Arrays.toString(arr));
			}
	}
		


