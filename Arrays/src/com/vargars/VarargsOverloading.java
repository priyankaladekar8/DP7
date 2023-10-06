package com.vargars;

public class VarargsOverloading {
	static void display(int... ar) {
		for (int i : ar) {
			System.out.println(i);
		}
	}

	static void display(double... f1) {
		System.out.println("In double method");
		for (double f : f1) {
			System.out.println(f);
		}
	}

	static void display(String... str) {
		for (String s : str) {
			System.out.println(s);
		}
	}

	static void display(int x, char... ch) {
		System.out.println(x);
		for (char c : ch) {
			System.out.println(c);

		}
	}

	static void display(char x, int... ch) {
		System.out.println(x);
		for (int c : ch) {
			System.out.println(c);
		}
	}

	public static void main(String args[]) {
		display(2, 3, 4);
		display("java", "c", "c++");
		display(4.5f, 87.9f);
		// display(); Ambiguity

		display('a', 8, 9, 5);
		display(8, 's', 'f', 'e');

	}

}
