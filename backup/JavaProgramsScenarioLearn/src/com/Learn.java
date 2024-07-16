package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Learn {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("a1", "5000");
		List<String> l2 = Arrays.asList("a2", "15000");
		List<String> l3 = Arrays.asList("a3", "55000");
		List<String> l4 = Arrays.asList("a4", "45000");
		List<String> l5 = Arrays.asList("a5", "35000");
		List<String> l6 = Arrays.asList("a6", "5000");
		List<List<String>> listList = Arrays.asList(l1, l2, l3, l4, l5, l6);
		System.out.println(main(listList));
	}

	private static List<String> main(List<List<String>> listList) {
		List<Integer> ln = new ArrayList<>();
		listList.stream()
				.forEach((action) -> ln.add(Integer.parseInt(action.get(1))));
		Integer greater = ln.stream().reduce(0, Integer::max);
		System.out.println("Sum value :" + greater);

		// listList.stream()
		// .filter(predicate -> predicate.contains(greater.toString()))
		// .forEach(System.out::println);

		return listList.stream()
				.filter(predicate -> predicate.contains(greater.toString()))
				.flatMap(mapper -> Stream.of(mapper.get(0)))
				.collect(Collectors.toList());

	}
}
