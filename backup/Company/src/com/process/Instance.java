package com.process;

class A {

}

class B extends A {

}

class C extends B {

}

public class Instance {

	public static void main(String[] args) {
		B b = new B();

		if (b instanceof B) {
			System.out.println("b instanceof B");
		}
		if ((b instanceof B) && (!(b instanceof A))) {
			System.out.println("(b instanceof B) && (!(b instanceof A))");
		}
		if ((b instanceof B) && (!(b instanceof C))) {
			System.out.println("(b instanceof B) && (!(b instanceof C))");
		}


	}

}
