package com.citi;

import java.util.*;

public class Doubts {

	public static void main(String[] args) {
		hashMap();
		hashTable();
		doConcurrentModificationException();
	}

	private static void doConcurrentModificationException() {
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(2);
		listInteger.add(1);
		listInteger.add(3);
		listInteger.add(7);
		listInteger.add(5);

		Iterator<Integer> iterator = listInteger.iterator();

		while (iterator.hasNext()) {
			Integer i = iterator.next();

			if (i == 3) {
				iterator.remove();
			}
		}

		System.out.println(listInteger);
	}

	private static void hashMap() {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(1, 1);
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put(2, 2);
		hashMap.put(1, 1);
		hashMap.put(1, null);
		System.out.println("hash map :" + hashMap);
	}

	private static void hashTable() {
		Map<Integer, Integer> hashMap = new Hashtable<>();
		hashMap.put(1, 1);
		// hashMap.put(null, null);
		// hashMap.put(null, null);
		hashMap.put(2, 2);
		hashMap.put(1, 1);
		// hashMap.put(1, null);
		System.out.println("hash table" + hashMap);
	}
}
