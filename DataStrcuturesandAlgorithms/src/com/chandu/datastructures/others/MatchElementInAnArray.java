package com.chandu.datastructures;

public class MatchElementInAnArray {

	static boolean containsCommonItem(char[] arr2, char[] arr1) {
		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'c', 'x' };
		char[] arr2 = { 'z', 'y', 'x' };
		System.out.println(containsCommonItem(arr1, arr2));
	}
}
