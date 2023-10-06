package com.labsession;

import java.util.Arrays;

public class CopyAnatherArray {
	static void coppyArray(int ar[])
	{
		int temp[]=new int[ar.length];
		for(int i=0; i<ar.length; i++)
		{
			temp[i]=ar[i];
		}
		System.out.println("after:"+Arrays.toString(temp));
	
	}
	public static void main(String args[])
	{
		int ar[]= {1,4,6,5,3,10};
		System.out.println("before:"+Arrays.toString(ar));
		coppyArray(ar);
	}

}
