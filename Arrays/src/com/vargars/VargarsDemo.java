package com.vargars;

public class VargarsDemo {
	static void display(int ar[]) {
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// ellipsis...
	// mehtod overloaded... number of arguments
	static void displayElements(int... a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		int arr1[] = { 2,3,4,5 };
		int arr2[] = { 5,6};
		int arr3[] = { 7,8,9 };

		display(arr1);
		display(arr2);
		display(arr3);

		System.out.println("-----------------");

		displayElements(7);
		displayElements(3, 4, 5);
		displayElements(2, 7, 0, 9, 4);

	}

}
