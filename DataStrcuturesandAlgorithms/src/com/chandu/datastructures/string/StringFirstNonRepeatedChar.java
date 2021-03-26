package com.chandu.datastructures.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringFirstNonRepeatedChar {

	public static void main(String[] args) {
		System.out.println("First non repeated character for String Estimate is : " + getNonRepeatedChar("Esimate"));
		System.out.println("First non repeated character for String PPaaji is : " + getNonRepeatedChar("PPaaji"));
	}

	public static Character getNonRepeatedChar(String str) {

		Map<Character, Integer> charcount = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			Character c = str.charAt(i);
			if (!charcount.containsKey(c)) {
				charcount.put(c, 1);
			} else {
				charcount.put(c, charcount.get(c) + 1);
			}
		}
		// As LinkedHashMap maintains insertion order, first character with
		// count 1 should return first non repeated character
		for (Entry<Character, Integer> e : charcount.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();

		}
		return null;

	}

}
