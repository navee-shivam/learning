package com.check;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Addition {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(3);
		// addNum(arrayList, 1);
		List<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(60);
		arrayList1.add(120);
		arrayList1.add(180);
		arrayList1.add(240);
		// songsPair(arrayList1);
		streamIterate();

	}

	private static void streamIterate() {
		Stream.iterate(2, count -> count + 1)
			.filter(value -> value % 2 == 0)
			.limit(10).forEach(System.out::println);
	}

	private static int addNum(List<Integer> arrayList, int e) {
		HashSet<Integer> uniqueNumbers = new HashSet(arrayList);
		int count = 0, add = 0;
		for (int i : uniqueNumbers) {
			add = i + e;
			if (uniqueNumbers.contains(add)) {
				count = count + 1;
			}
		}
		System.out.println("count : " + count);
		return count;
	}

	private static int songsPair(List<Integer> arrayList1) {
		int count = 0, additionValue = 0;
		// TODO Auto-generated method stub
		for (int a : arrayList1) {
			if (a % 60 == 0 || additionValue % 60 == 0) {
				count = count++;
				additionValue = 0;
			} else {
				additionValue = additionValue + a;
			}
		}
		System.out.println("count : " + count);
		return count;
	}
}
