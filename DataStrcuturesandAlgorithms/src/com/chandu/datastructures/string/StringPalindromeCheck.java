package com.chandu.datastructures.string;

import java.util.Scanner;

/**
 *
 * @author @Chandu Given an String, write a function to find whether the given
 *         String is a Palindrome or not.
 *
 */
public class StringPalindromeCheck {

	public static boolean isPalindrome(String input) {
		char[] chararray = input.toCharArray();
		int start = 0;
		int end = chararray.length - 1;
		while (start < end) {
			if (chararray[start] != chararray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter a String: ");
		String input = in.nextLine();
		if(isPalindrome(input)) {
			System.out.println("The Entered String is a Palindrome: " + input);
		}
		else {
			System.out.println("The Entered String is not a Palindrome: " + input);
		}

	}

}
