package com.labsession;

import java.util.Arrays;

public class MaximumFrquency {
	static void findFreq(int ar[]) {

		
		int count;
		boolean visited;
		int max=0;
		int num=0;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			visited = false;
			
			// checking if the element compared: not a new element
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					visited = true;
					break;
				}
			}
		
			if (visited == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}

				}
				System.out.println(ar[i] + "--->" + count);
			}
			if(count>max) {
				max=count;
				num=ar[i];
			}
		}
			System.out.println("maxFrquency "+num+" ---->"+max);
		}
	


	public static void main(String args[]) {
		int arr[] = { 3, 4, 5, 6, 5, 4, 5, 1, 3 };

		System.out.println(Arrays.toString(arr));
		findFreq(arr);
	}
}
