package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Synchr {

	public static void main(String[] args) {
		List<String> ip = new ArrayList<>();
		ip.add("three two one");
		ip.add("one two three test");
		ip.add("one two three two three one three four");
		List<String> a = getNumber(ip);
	}

	private static List<String> getNumber(List<String> ip) {
		List<String> output = new ArrayList<>();
		List<Map<String, Integer>> listMap = new ArrayList<>();

		for (String seperate : ip) {
			String[] d = seperate.split(" ");
			Map<String, Integer> resultMap = new HashMap<>();
			for (String each : d) {
				getEquivalent(each.toString(), resultMap);
			}
			listMap.add(resultMap);
		}
		System.out.println(listMap);
		return null;
	}

	private static void getEquivalent(String each,
			Map<String, Integer> resultMap) {
		if (each.equals("zero")) {
			resultMap.put(each, 0);
		} else if (each.equals("one")) {
			resultMap.put(each, 1);
		} else if (each.equals("two")) {
			resultMap.put(each, 2);
		} else if (each.equals("three")) {
			resultMap.put(each, 3);
		} else if (each.equals("four")) {
			resultMap.put(each, 4);
		} else if (each.equals("five")) {
			resultMap.put(each, 5);
		} else {
			resultMap.put("Invalid", -1);
		}
	}

	// private static List<String> getNumber(List<String> ip) {
	// List<String> outputList = new ArrayList<>();
	// System.out.println(ip);
	//
	// List<String> tokens = new ArrayList<>();
	//
	// for (String eachString : ip) {
	// tokens.add(eachString);
	// outputList.addAll(getData(eachString));
	// }
	// System.out.println(tokens);
	//
	// return outputList;
	// }
	//
	// private static List<String> getData(String stringGet) {
	//
	// List<String> tokens = Arrays.asList(stringGet.split("\\s+"));
	// List<String> computedString = new ArrayList<>();
	//
	// for (String eachToken : tokens) {
	// System.out.println(eachToken);
	// computedString.add(numberReturn(eachToken));
	// }
	//
	// return computedString;
	// }
	//
	// private static String numberReturn(String eachToken) {
	// String[] array = { "zero", "one", "two", "three", "four", "five", "six",
	// "seven", "eight", "nine" };
	// if (eachToken.equals(array[0])) {
	// return "0";
	// } else if (eachToken.equals(array[1])) {
	// return "1";
	// } else if (eachToken.equals(array[2])) {
	// return "2";
	// } else if (eachToken.equals(array[3])) {
	// return "3";
	// } else if (eachToken.equals(array[4])) {
	// return "4";
	// } else if (eachToken.equals(array[5])) {
	// return "5";
	// } else if (eachToken.equals(array[6])) {
	// return "6";
	// } else if (eachToken.equals(array[7])) {
	// return "7";
	// } else if (eachToken.equals(array[8])) {
	// return "8";
	// } else if (eachToken.equals(array[9])) {
	// return "9";
	// } else {
	// return "-1";
	// }
	// }

}
