package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// System.out.println(checkStrings("abcd", "abcd"));
		// add(10, 2);
		List<Integer> l1 = Arrays.asList(12, 25, 60, 11, 7);
		System.out.println(getMidListElementWithoutLength(l1));

	}

	private static int getMidListElementWithoutLength(List<Integer> l1) {
		Integer mid = -1;
		Integer fullLength = 0;
		Integer iteratorLength = 0;

		Iterator itr = l1.iterator();

		while (itr.hasNext()) {
			itr.next();
			iteratorLength++;
		}

		System.out.println("iteratorlength : " + iteratorLength);
		for (Integer i : l1) {
			fullLength++;
		}
		System.out.println(fullLength);

		return l1.get(fullLength / 2);
	}

	private static void add(int x, int y) {
		System.out.println("Integer :" + Integer.sum(x, y));
		for (int i = 1; i <= y; i++) {
			x++;
		}
		System.out.println("ADd : " + x);
	}

	private static boolean checkStrings(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		List<Character> l1 = new ArrayList<>();
		List<Character> l2 = new ArrayList<>();
		System.out.println("before opn : " + l1 + " L@ :" + l2);
		setList(c1, l1);
		System.out.println("after opn : " + l1);
		setList(c2, l2);
		System.out.println("after opn : " + l2);
		Collections.sort(l1);
		Collections.sort(l2);
		return l1.equals(l2);

	}

	private static void setList(char[] c, List<Character> charList) {
		for (Character i : c) {
			charList.add(i);
		}
	}
}
