package com.citi;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		removeDuplicate("senthilshan");
	}

	private static void removeDuplicate(String string) {
		char[] charArray = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char ch : charArray)
			charSet.add(ch);

		StringBuilder sb = new StringBuilder();
		for (char ch : charSet)
			sb.append(ch);

		System.out.println(sb);
	}
}
