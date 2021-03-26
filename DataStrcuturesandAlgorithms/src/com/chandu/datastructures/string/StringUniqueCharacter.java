package com.chandu.datastructures.string;

import java.util.HashSet;

public class StringUniqueCharacter {

	public static void main(String[] args) {

		System.out.println("Sachin has all unique chars using Hashset : " + hasAllUniqueCharsSet("sachin"));
		System.out.println("Dravid has all unique chars using Hashset  : " + hasAllUniqueCharsSet("dravid"));
		System.out.println();
		System.out.println("************************************************");
		System.out.println();
		System.out.println("Shewag has all unique chars using indexOf  : " + hasAllUniqueChars("shewag"));
		System.out.println("Dhoni has all unique chars using indexOf  : " + hasAllUniqueChars("dhonii"));
	
	}

	// Checking String Unique Character using Hash Set
	public static boolean hasAllUniqueCharsSet(String str) {

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			// If Hashset's add method return false,that means it is already present in Hash Set

			if (!set.add(c))
				return false;
		}

		return true;
	}
	
	// Checking String Unique Character using indexof and lastIndexOf
	public static boolean hasAllUniqueChars (String str) {
		 
	     for(int i=0;i < str.length(); i ++)   {
	 
	         char c =str.charAt(i);
	         if(str.indexOf(c)!=str.lastIndexOf(c))
	              return false;
	     }
	 
	     return true;
	 }

}
