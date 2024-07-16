package com.citi;

import java.util.*;
import java.util.stream.IntStream;

public class CountingEvenPairs {

	public static void main(String[] args) {
		int[] c = { 1, 2, 3, 4 };
		List<Integer> even = new LinkedList<>();
		List<Integer> odd = new LinkedList<>();
		long count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 0)
				even.add(c[i]);
			else
				odd.add(c[i]);
		}
		count = getPair(odd);
		count += getPair(even);
		System.out.println(count);
	}

	private static long getPair(List<Integer> list) {
		int limit = list.size() - 1;
		System.out.println(list);
		long count = 1;
		if (limit > 1)
			count = IntStream.range(0, limit).sum();
		return count;
	}
}
