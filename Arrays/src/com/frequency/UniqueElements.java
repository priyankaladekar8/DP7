package com.frequency;

public class UniqueElements {

	static void findUnique(int ar[]) {
		int count;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == '\0')
				continue;
			count = 1;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					ar[j] = '\0';
				}
			}
			if (count == 1) {
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 3, 4, 3, 6, 7, 3, 4, 3 };
		findUnique(arr);
	}

}
