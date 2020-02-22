
package com.bridgelabz;

class A {
	public void show() {
		System.out.println("show() in class A");
	}
	public void get() {
	}
}

class B extends A {
	public void show() {
		System.out.println("show() in class B");
	}

	public void get() {
		System.out.println("get() in class B");
	}
}

public class Main {

	public static void main(String[] args) {
		A obj = new B();
		obj.show();
		obj.get();
	}
}
