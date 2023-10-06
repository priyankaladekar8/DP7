package com.vargars;

public class VarargsDemo2 {
	
	static void method1(int n1, int n2)
	{
		System.out.println(n1+n2);
	}
	
	static void method1(int n1, int n2, int n3)
	{
		System.out.println(n1+n2+n3);
	}
	
	// varags
	
	// Rules1: There can be only 1 varargs
	
//	static void display(int ...a, String ...s)
//	{
//		
//	}
	
	// Rule : Varargs : last argument in the method
	
	static void printMe(int num, String ...str)
	{
		System.out.println(num);
		for(String s:str)
		{
			System.out.println(s);
		}
	}
	
//	static void printMe(int num, String ...str, float n1)
//	{
//		System.out.println(num);
//		for(String s:str)
//		{
//			System.out.println(s);
//		}
//	}
	
	static void method2(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		method1(5, 6);
		method1(3, 5, 6);
		
		method2(5,7,9);
		method2(3,5);
		
		//display(1,2,3,"Shuruti","Hina");
		
		printMe(7, "Pratiksha","Dipti","Aniket");
		
		//printMe(7, "Pratiksha","Dipti","Aniket", 78.6f);
		
	}

}
