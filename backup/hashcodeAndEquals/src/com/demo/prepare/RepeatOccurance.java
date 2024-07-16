package com.demo.prepare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatOccurance {

	public static void main(String[] args)
			throws IOException, FileNotFoundException {

		Set<Entry<String, Integer>> wholeEntrySet = readLineSetData(readFile())
				.entrySet();
		for (Entry<String, Integer> singleEntrySet : wholeEntrySet) {
			if (singleEntrySet.getValue() > 1) {
				System.out
						.println(singleEntrySet.getKey() + " " + singleEntrySet.getValue());
			}
		}
	}

	/**
	 * Read the file
	 * Add your file path below
	 * @return
	 * @throws FileNotFoundException
	 */
	private static BufferedReader readFile() throws FileNotFoundException {
		return new BufferedReader(
				new FileReader("C:/Users/navee/Desktop/bigFile.txt"));
	}

	/**
	 * Read each line and assign into the map
	 *
	 * @param bufferReader
	 * @return
	 * @throws IOException
	 */
	private static HashMap<String, Integer> readLineSetData(
			BufferedReader bufferReader) throws IOException {
		HashMap<String, Integer> wordsHashMap = new HashMap<String, Integer>();
		String currentLine = bufferReader.readLine();
		while (currentLine != null) {
			String[] words = currentLine.toLowerCase().split(" ");
			for (String word : words) {
				if (wordsHashMap.containsKey(word)) {
					wordsHashMap.put(word, wordsHashMap.get(word) + 1);
				} else {
					wordsHashMap.put(word, 1);
				}
			}
			currentLine = bufferReader.readLine();
		}
		return wordsHashMap;
	}

}
