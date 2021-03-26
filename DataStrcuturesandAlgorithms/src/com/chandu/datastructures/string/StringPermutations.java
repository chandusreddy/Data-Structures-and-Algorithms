package com.chandu.datastructures.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringPermutations {

	public static void main(String[] args) {

		Set<String> set = StringPermutation("CAD");

		System.out.println("Permutations of String CAD are:");

		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {

			String string = (String) iterator.next();

			System.out.println(string);
		}
	}

	public static Set<String> StringPermutation(String str) {

		Set<String> permutationset = new HashSet<String>();

		if (str.length() == 0) {
			permutationset.add("");
			return permutationset;
		}

		// take out first character of String
		Character c = str.charAt(0);

		// Remaining String
		String remain = str.substring(1);

		Set<String> remainingPermutateString = StringPermutation(remain);

		for (String stringpermuated : remainingPermutateString) {
			for (int j = 0; j <= stringpermuated.length(); j++) {
				String permutation = insertFirstCharAtDiffPlaces(stringpermuated, c, j);
				permutationset.add(permutation);
			}

		}
		return permutationset;

	}

	public static String insertFirstCharAtDiffPlaces(String perm, char firstChar, int index) {
		// Inserting firstCharacter of orig String at difference places based on index
		return perm.substring(0, index) + firstChar + perm.substring(index);
	}

}
