package com.chandu.datastructures.string;

public class StringLengthFunction {
	public static void main(String[] args) {
		String str = "Hello world";
		System.out.println("Length of the given String:  " + str + " is : " + StringLengthfinder(str));

	}

	private static int StringLengthfinder(String str) {
		int length = 0;
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			length++;
		}
		return length;
	}
}
