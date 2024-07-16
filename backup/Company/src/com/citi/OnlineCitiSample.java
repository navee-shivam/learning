package com.citi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnlineCitiSample {

	public static void main(String[] args) {
		 int[] A = { 1, 3, 6, 4, 1, 2, 5 };
		// int[] A = { 1000, 30000 };
//		int[] A = { 1, 2, 3 };
		System.out.println(getValue(A));
	}

	private static int getValue(int[] A) {
		List<Integer> ls = new ArrayList<>();
		for (int i : A) {
			ls.add(i);
		}
		Collections.sort(ls);
		for (int i = 1; i <= ls.size() + 1; i++) {
			if (!ls.contains(i)) {
				return i;
			}
		}
		return 1;
	}

}
