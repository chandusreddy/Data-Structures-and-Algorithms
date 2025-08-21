package com.chandu.datastructures.string;

public class StringComparison {
	public static void main(String[] args) {
		String a = "Chandu";
		String b = "Chandu";
		
		// a== b - checks if reference variables are pointing to the same object
		System.out.println("String Comparison using Method ");
		System.out.println(a==b);
		
		String aa = new String("Chandu");
		String bb = new String("Chandu");
		// when you need only to check the value use the .equals method
		System.out.println("String Comparison using .equals method: " + aa.equals(bb));
		
		
		
		
	}

}
