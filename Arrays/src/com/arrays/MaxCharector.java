package com.arrays;

public class MaxCharector {
	static char checkMax(char arr[]) {
	char max=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	 return max;
}
		
	
	public static void main(String args[])
	{
		char arr[]= {'a', 'b', 'c', 'd', 'g'};
		System.out.println("max charectar is "+checkMax(arr));
	}

}
