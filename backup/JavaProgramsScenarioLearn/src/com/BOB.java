package com;

public class BOB {

	public static void main(String[] args) {
		System.out.println(winner("EMHH", "MMMM"));

	}

	public static String winner(String erica, String bob) {
		// Write your code here
		String resultWinner;
		int ericaValue = getValue(erica);
		int bobValue = getValue(bob);
		if (ericaValue == bobValue) {
			resultWinner = "Tie";
		} else if (ericaValue > bobValue) {
			resultWinner = "Erica";
		} else {
			resultWinner = "Bob";
		}
		return resultWinner;
	}

	public static int getValue(String name) {
		int value = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (String.valueOf(c).equals("E")) {
				value += 1;
			} else if (String.valueOf(c).equals("M")) {
				value += 3;
			} else {
				value += 5;
			}
		}
		return value;
	}

}
