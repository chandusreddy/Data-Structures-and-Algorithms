package com.chandu.datastructures.string;

public class StringRotationCheck {

	public static void main(String[] args) {

		System.out.println("corejava and javacore are rotation of each other : " + isRotation("javacore", "corejava"));
		System.out.println("corejava and lavajava are rotation of each other : " + isRotation("javacore", "lavajava"));

	}

	public static boolean isRotation(String str, String rotation) {
		String str2 = str + str;

		if (str2.contains(rotation)) {
			return true;
		}
		return false;

	}

}
