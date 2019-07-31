package com.capgemini.compete;

import java.util.Scanner;

public class LetterCapitalize {

	public static String LetterCapital(String str) {

		char[] strChars = str.toCharArray();
		strChars[0] = Character.toUpperCase(strChars[0]);
		for (int i = 1; i < strChars.length; i++) {
			if (strChars[i - 1] == ' ')
				strChars[i] = Character.toUpperCase(strChars[i]);
		}

		str = String.valueOf(strChars);

		return str;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(LetterCapital(s.nextLine()));

	}

}
