package com.arrays;
//Enhnce for loop

public class DivisibleByNumber{
	public static void main(String args[])
	{
		 int arr[]= {6,4,3,9,15,5,30};
		 int sum=0;
		 for(int i:arr)
		 {
			if((i%3==0) &&(i%5==0)) 
			{
				sum=sum+i;
			}
		 }
		 System.out.println(sum);
}
}
