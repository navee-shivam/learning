package com.process;

import java.util.HashSet;
import java.util.Set;

class Parent {
	protected HashSet my = new HashSet();

	public Parent() {
		my.add(10);
	}

	public Set getSet() {
		return my;
	}
}

public class Child extends Parent {

	Child(Integer val) {
		my.add(10);
	}

	@Override
	public HashSet getSet() {
		return my;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
