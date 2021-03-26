package com.chandu.datastructures.string;

public class StringReverse {

	public static void main(String[] args) {

		String name = "sachin";
		String reverse = "";
		// Reverse a String using For-Loop
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		// Reverse a String using Recursive
		StringReverse rs = new StringReverse();
		String recursiveReverse = rs.recursiveReverse(name);
		// Reverse a String using String Buffer
		StringBuffer sb = new StringBuffer(name);
		StringBuffer stringBufferreverse = sb.reverse();
		// Printing out the Reverse of the String name
		System.out.println("Reverse of String using for Loop of " + name + " is " + reverse);
		System.out.println("Reverse of String using Recursive of  " + name + " is " + recursiveReverse);
		System.out.println("Reverse of String using StringBuffer of  " + name + " is " + stringBufferreverse);

	}

	// Reverse a String using Recursive
	public String recursiveReverse(String name) {
		if (name.length() == 1)
			return name;
		else
			return name.charAt(name.length() - 1) + recursiveReverse(name.substring(0, name.length() - 1));

	}

}
