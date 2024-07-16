package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class CountingPairs {

	public static void main(String[] args) {
		System.out.println(countPairs(Arrays.asList(1, 2, 3, 4, 5, 6), 2));
	}

	public static int countPairs(List<Integer> numbers, int k) {
		HashSet<HashSet> hs = new HashSet<HashSet>();
		IntStream.range(0, numbers.size())
				.forEach(i -> IntStream.range(0, numbers.size())
						.filter(j -> i != j && numbers.get(i) - numbers.get(j) == k)
						.forEach(j -> {
							HashSet<Integer> inner = new HashSet<>();
							inner.add(numbers.get(j));
							inner.add(numbers.get(i));
							hs.add(inner);
						}));
		return hs.size();
	}
}
