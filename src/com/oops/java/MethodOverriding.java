package com.oops.java;

import java.util.Scanner;

class A {
	int x, y, total;

	void calc(int a, int b) {
		x = a;
		y = b;
		total = x + y;
		System.out.println("sum=" + total);

	}

	class B extends A {
		void calc(int a, int b) {
			x = a;
			y = b;
			total = x * y;
			System.out.println("mul=" + total);
		}
	}
}

class C extends A {
	void calc(int a, int b) {
		x = a;
		y = b;
		total = x / y;
		System.out.println("divide result=" + total);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first value ");
		int x = scanner.nextInt();

		System.out.println("Enter second value ");
		int y = scanner.nextInt();
		A t = new A();

		t.calc(x, y);
		
		// overriding inner class
		A.B b = t.new B();
		b.calc(x, y);
		
		A c = new C();
		c.calc(x, y);

	}

}
