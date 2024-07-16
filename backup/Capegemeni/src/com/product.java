package com;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class product {

	public static List<String> method() {
		List<String> inputList = new ArrayList<>();
		List<Map<Integer, Integer>> outputList = new ArrayList<>();
		inputList.add("three two one");
		inputList.add("one two three fsdfsdf");
		inputList.add("one five five three two two");
		for (String der : inputList) {
			String[] b = der.split(" ");
			Map<Integer, Integer> processMap = new HashMap<Integer, Integer>();
			for (String ref : b) {
				if (ref.toString().equals("zero")) {
					common(processMap, 0);
				} else if (ref.toString().equals("one")) {
					common(processMap, 1);
				} else if (ref.toString().equals("two")) {
					common(processMap, 2);
				} else if (ref.toString().equals("three")) {
					common(processMap, 3);
				} else if (ref.toString().equals("four")) {
					common(processMap, 4);
				} else if (ref.toString().equals("five")) {
					common(processMap, 5);
				} else if (ref.toString().equals("six")) {
					common(processMap, 6);
				} else if (ref.toString().equals("seven")) {
					common(processMap, 7);
				} else if (ref.toString().equals("eight")) {
					common(processMap, 8);
				} else if (ref.toString().equals("nine")) {
					common(processMap, 9);
				} else {
					common(processMap, 10);
					break;
				}
				System.out.println(processMap);
			}
			outputList.add(processMap);
		}
		List<String> resultoutputList = new ArrayList<>();
		outputList.stream().forEach(a -> {
			if (a.containsKey(10)) {
				resultoutputList.add("INVALID");
			} else {
				String ad = "";
				for (int j = 0; j < 10; j++) {
					if (a.containsKey(j)) {
						ad += j + "-" + a.get(j).toString() + ",";

					}
				}
				resultoutputList.add(ad.substring(0, ad.length() - 1));
			}
		});
		System.out.println(outputList);
		System.out.println(resultoutputList);
		return resultoutputList;

	}

	private static void common(Map<Integer, Integer> processMap, Integer key) {
		if (processMap.containsKey(key)) {
			processMap.put(key, processMap.get(key) + 1);
		} else {
			processMap.put(key, 1);
		}
	}

	public static void main(String[] args) {
		method();
	}

}
