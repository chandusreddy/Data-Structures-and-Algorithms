package com.chandu.datastructures.string;

//Time complexity: O(N^3) -> As the substring has a time complexity of O(N) and then nested loops.
//Space complexity: O(1), where N is the length of the input string.
public class StringAllSubStrings {
	public static void main(String args[]) {

		String str = "abcc";

		System.out.println("All substring of abcc are:");

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));

			}

		}
	}

}
