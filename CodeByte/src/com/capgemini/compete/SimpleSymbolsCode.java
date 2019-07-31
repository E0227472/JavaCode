package com.capgemini.compete;

import java.util.Scanner;

public class SimpleSymbolsCode {

	public static String SimpleSymbols(String str) {
		String result = "true";
		char strChars[] = str.toCharArray();

		if (str.length() <= 2)
			result = "false";

		else if (Character.isLetter(strChars[0]))
			result = "false";

		else {
			for (int i = 1; i < strChars.length - 1; i++) {
				if (Character.isLetter(strChars[i])) {
					if (strChars[i - 1] != '+' || strChars[i + 1] != '+') {
						result = "false";
						break;
					}
				}
			}
		}

		return result;

	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.println("Enter a string value: ");
		Scanner s = new Scanner(System.in);
		System.out.print(SimpleSymbols(s.nextLine()));
	}

}
