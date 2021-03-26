package com.chandu.datastructures.string;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {
		String name = "listen";
		String anagram = "slient";

		System.out.println(
				"Listen and Slient both are anagrams using String Methods: " + isAnagramStringMethods(name, anagram));
		System.out.println(
				"Listen and Slient both are anagrams using Arrays Sort : " + isAnagramUsingArraySort(name, anagram));
		System.out.println("Listen and Slient both are anagrams using Count Value : " + isAnagram(name, anagram));
	}

	// Checking the String Anagram using the String Methods
	private static boolean isAnagramStringMethods(String name, String anagram) {
		if (name.length() != anagram.length()) {
			return false;
		}
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			int index = anagram.indexOf(c);
			// If index of any character is -1, then two strings are not anagrams
			// If index of character is not equal to -1, then remove the character from the
			// String
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());

			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}

	// Checking the String Anagram using the Arrays Sort Methods
	public static boolean isAnagramUsingArraySort(String name, String anagram) {

		String sortedname = sortChars(name);
		String sortedAnagram = sortChars(anagram);
		return sortedname.equals(sortedAnagram);
	}

	public static String sortChars(String str) {
		char[] strArr = str.toLowerCase().toCharArray();
		Arrays.sort(strArr);
		return String.valueOf(strArr);
	}

	// Checking the String Anagram using the count array
	public static boolean isAnagram(String name, String anagram) {
		if (name.length() != anagram.length()) {
			return false;
		}
		int count[] = new int[256];
		for (int i = 0; i < name.length(); i++) {
			count[name.charAt(i)]++;
			count[anagram.charAt(i)]--;
		}
		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
