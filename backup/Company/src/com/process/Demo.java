package com.process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		l1.add(3);
		l1.add(4);
		l1.add(1);
		l2.add(9);
		l2.add(5);
		l2.add(1);

//		 findRepeated(l1, l2);
		makeSingle(l1, l2);
	}

	private static void findRepeated(List<Integer> l1, List<Integer> l2) {
		System.out.println(l1.stream().filter(predicate -> l2.contains(predicate))
				.collect(Collectors.toList()));
	}

	private static void makeSingle(List<Integer> l1, List<Integer> l2) {
		List<Integer> l3 = new ArrayList<>();
		l3.addAll(l1);
		l3.addAll(l2);

		System.out.println(l3);
		System.out.println(l3.stream().filter(n -> Collections.frequency(l3, n) > 1)
				.collect(Collectors.toSet()));

	}

}
