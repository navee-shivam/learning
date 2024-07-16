package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinuteDilema {

	public static void main(String[] args) {
		System.out.println(playlist(Arrays.asList(30, 20, 150, 100, 40)));

	}

	public static long playlist(List<Integer> songs) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int t : songs) {
			if (map.containsKey(((60 - t % 60)) % 60)) {
				count += map.get((60 - t % 60) % 60);
			}
			map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
		}
		return count;
	}
}