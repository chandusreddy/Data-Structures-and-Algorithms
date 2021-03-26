package com.chandu.datastructures.string;

import java.util.HashMap;

public class StringDuplicateCharacters {

	public static void main(String[] args) {
		
		String str = "sachinntendulkarr";
		// Storing the Character as the key and the count value as the value in the HashMap to determine the duplicate characters
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		for (Character c : map.keySet()) {
			if (map.get(c) > 1)
				System.out.println("Duplicate character in the String is : " + c + " ====== " + " and the count value is : " + map.get(c));

		}

	}
}
