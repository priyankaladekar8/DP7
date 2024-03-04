package logicalprogram.java;

public class MethodCalling {
	static void factNumber(int n)//formal or dumy argument
	{
		long fact=1;
		for (int i=1; i<=n; i++)
		{
			fact*=i;
		}
		System.out.println("the factorial of "+n+"is:" +fact);
		//n=n+5;
		//System.out.println(n);
	}
	

public static void main(String []args) {
	int num;
	num=7;
	factNumber(num);//actual argument
	factNumber(7);
	factNumber(9);
	System.out.println(num);
}
}